package br.com.poo.individual.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.entities.Habilidade;
import br.com.poo.individual.services.HabilidadeService;
import br.com.poo.util.Util;

public class HabilidadeController {

	//Instância do serviço da Habilidade, construção do objeto habilidadeService
	HabilidadeService habilidadeService = new HabilidadeService();
	static Logger logger = Util.setupLogger();
	
	public void listarHabilidadesTela() throws IOException {
		//Acessa o método listarHabilidades() da classe HabilidadeService
		List<Habilidade> habilidades = habilidadeService.listarHabilidadesTela();
		Util.customizer();
		logger.log(Level.INFO, () -> habilidades + "\n\nLista gerada com sucesso!");
	}
	
	public void listarHabilidades() throws IOException {
		habilidadeService.listarHabilidades();
		Util.customizer();
		logger.log(Level.INFO, () -> "\n\nRelatório gerado com sucesso!");
	}

}
