package br.com.poo.individual.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.individual.entities.Habilidade;
import br.com.poo.individual.io.RelatorioIO;

public class HabilidadeService {

	public List<Habilidade> listarHabilidadesTela() throws IOException {
		List<Habilidade> listaHabilidades = new ArrayList<>();
		for (Habilidade habilidade : Habilidade.getMapaHabilidades().values()) {
			listaHabilidades.add(habilidade);
		}
		RelatorioIO.relatorioListaHabilidades(listaHabilidades);
		return listaHabilidades;
	}
	
	public List<Habilidade> listarHabilidades() throws IOException {
		// Cria uma instância de lista vazia do tipo String
		List<Habilidade> listaHabilidades = new ArrayList<>();
		for (Habilidade habilidade : Habilidade.getMapaHabilidades().values()) {
			listaHabilidades.add(habilidade);
		}
		RelatorioIO.relatorioListaHabilidades(listaHabilidades);
		return listaHabilidades;
	}

}
