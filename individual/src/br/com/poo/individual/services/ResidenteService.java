package br.com.poo.individual.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.individual.entities.Residente;
import br.com.poo.individual.io.RelatorioIO;

public class ResidenteService {

	public List<Residente> listarResidentesTela() throws IOException {
		// Cria uma instância de lista vazia do tipo String
		List<Residente> listaResidentes = new ArrayList<>();
		for (Residente residente : Residente.getMapaResidentes().values()) {
			listaResidentes.add(residente);
		}
		return listaResidentes;
	}

	public List<Residente> listarResidentes() throws IOException {
		// Cria uma instância de lista vazia do tipo String
		List<Residente> listaResidentes = new ArrayList<>();
		for (Residente residente : Residente.getMapaResidentes().values()) {
			listaResidentes.add(residente);
		}
		RelatorioIO.relatorioListaResidentes(listaResidentes);
		return listaResidentes;
	}

	// Método que retorna uma lista do tipo String
	public static List<String> listaNomesResidentes() {
		// Cria uma instância de lista vazia do tipo String
		List<String> listaNomesResidentes = new ArrayList<>();
		// Cria um forEach para percorrer o mapa de Habilidades
		for (Residente residente : Residente.getMapaResidentes().values()) {
			// Adiciona o nome da habilidade na lista ListaNomesHabilidades
			listaNomesResidentes.add(residente.getNome());
		}
		// Retorna a lista listaNomesHabilidades com todos os nomes das habilidades
		return listaNomesResidentes;
	}
}
