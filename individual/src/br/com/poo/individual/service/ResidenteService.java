package br.com.poo.individual.service;

import java.util.ArrayList;
import java.util.List;

import br.com.poo.individual.entities.Residente;

public class ResidenteService {

	// Método que retorna uma lista do tipo String
	public List<String> listaNomesResidentes() {
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

	public List<Residente> listaResidentes() {
		List<Residente> listaResidentes = new ArrayList<>();
		for (Residente residente : Residente.getMapaResidentes().values()) {
			listaResidentes.add(residente);
		}
		return listaResidentes;
	}
}
