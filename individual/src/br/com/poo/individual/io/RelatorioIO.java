package br.com.poo.individual.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.com.poo.individual.entities.Residente;
import br.com.poo.individual.entities.Habilidade;
import br.com.poo.individual.enums.TipoRegistro;

public class RelatorioIO {

	static final String PATH_BASICO = "./individual/temp/";
	static final String EXTENSAO = ".txt";
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public static void leitor(String path) throws IOException {
		// System.out.println("O diretório atual é: " + System.getProperty("user.dir"));
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
		String linha = "";
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				String[] dados = linha.split(";");

				if (dados[0].equalsIgnoreCase(TipoRegistro.RESIDENTE.name())) {
					/*
					 * 1 - Integer id; 2 - String nome; 3 - String cpf; 4 - String email; 5
					 * -LocalDate dataNasc; 6 - String formacao; 7 - Integer fkHabilidade;
					 */
					Residente residente = new Residente(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4],
							LocalDate.parse(dados[5], dtf), dados[6], Integer.parseInt(dados[7]));
					Residente.getMapaResidentes().put(Integer.parseInt(dados[1]), residente);
				} else if (dados[0].equalsIgnoreCase(TipoRegistro.HABILIDADE.name())) {
					/*
					 * 1 - Integer id; String nome; 2 - String descricao; 3 - int fkResidente;
					 */
					Habilidade habilidade = new Habilidade(Integer.parseInt(dados[1]), dados[2], dados[3],
							Integer.parseInt(dados[4]));
					Habilidade.getMapaHabilidades().put(Integer.parseInt(dados[1]), habilidade);
				}
			} else {
				break;
			}
		}
		buffRead.close();
	}

	public static void relatorioListaHabilidades(List<Habilidade> habilidades) throws IOException {
		String nome = "lista-habilidades";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));

		buffWrite.append("-------RELATÓRIO: LISTA DE HABILIDADES------\n\n");
		if (!habilidades.isEmpty()) {
			// For each para percorer o nome das habilidades, uma a uma
			for (Habilidade habilidade : habilidades) {
				buffWrite.append("Nome: " + habilidade.getNome() + "\tDescrição: " + habilidade.getDescricao() + "\n");
			}
		}
		buffWrite.append("\n\n---------FIM DA LISTA DE HABILIDADES--------\n\n");
		buffWrite.close();
	}

	public static void relatorioListaResidentes(List<Residente> residentes) throws IOException {
		String nome = "lista-residentes";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));

		buffWrite.append("-------RELATÓRIO: LISTA DE RESIDENTES------\n\n");
		if (!residentes.isEmpty()) {
			// For para percorrer a lista de pessoas
			for (Residente residente : residentes) {
				buffWrite.append("Nome: " + residente.getNome() + "\n");
			}
		}

		buffWrite.append("\n\n---------FIM DA LISTA DE RESIDENTES--------\n\n");
		buffWrite.close();
	}
}
