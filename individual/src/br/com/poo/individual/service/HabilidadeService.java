package br.com.poo.individual.service;

import java.util.ArrayList;
import java.util.List;

import br.com.poo.individual.entities.Habilidade;

public class HabilidadeService {

	// Método que retorna uma lista do tipo String
	public List<String> listaNomesHabilidades() {
		// Cria uma instância de lista vazia do tipo String
		List<String> listaNomesHabilidades = new ArrayList<>();
		// Cria um forEach para percorrer o mapa de Habilidades
		for (Habilidade habilidade : Habilidade.getMapaHabilidades().values()) {
			// Adiciona o nome da habilidade na lista ListaNomesHabilidades
			listaNomesHabilidades.add(habilidade.getNome());
		}
		// Retorna a lista listaNomesHabilidades com todos os nomes das habilidades
		return listaNomesHabilidades;
	}

	public List<Habilidade> listaHabilidades() {
		List<Habilidade> listaHabilidades = new ArrayList<>();
		for (Habilidade habilidade : Habilidade.getMapaHabilidades().values()) {
			listaHabilidades.add(habilidade);
		}
		return listaHabilidades;
	}
}
