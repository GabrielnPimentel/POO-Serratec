package br.com.poo.individual.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


import br.com.poo.individual.entities.Residente;
import br.com.poo.individual.entities.Habilidade;
import br.com.poo.individual.enums.TipoRegistro;
import br.com.poo.util.Util;

public class RelatorioIO {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	private static Logger logger = Util.setupLogger();
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public static void leitor(String path) throws IOException {
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
							LocalDate.parse(dados[5],dtf), dados[6], Integer.parseInt(dados[7]));
					Residente.getMapaResidentes().put(Integer.parseInt(dados[1]), residente);
					logger.log(Level.INFO, residente::toString);
				} else if (dados[0].equalsIgnoreCase(TipoRegistro.HABILIDADE.name())) {
					/*
					 * 1 - Integer id; String nome; 
					 * 2 - String descricao; 
					 * 3 - int fkResidente;
					 */
					Habilidade habilidade = new Habilidade(Integer.parseInt(dados[1]), dados[2], dados[3],
							Integer.parseInt(dados[4]));
					Habilidade.getMapaHabilidades().put(Integer.parseInt(dados[1]), habilidade);
					logger.log(Level.INFO, habilidade::toString);
				}
			} else {
				break;
			}
		}
		buffRead.close();
	}
	
	public static void escritor(String path) throws IOException {
		Scanner sc = new Scanner(System.in);
		Util.setupLogger().log(Level.INFO, () -> "Escreva o nome do arquivo: ");
		String nome = sc.next();

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + path));
		String linha = "";

		Util.setupLogger().log(Level.INFO, () -> "Escreva algo: ");
		linha = sc.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
		sc.close();
	}
}
