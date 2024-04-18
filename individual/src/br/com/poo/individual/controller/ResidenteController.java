package br.com.poo.individual.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.entities.Residente;
import br.com.poo.individual.services.ResidenteService;
import br.com.poo.util.Util;

public class ResidenteController {
	
	ResidenteService residenteService = new ResidenteService();
	static Logger logger = Util.setupLogger();


	public void listarResidentesTela() throws IOException {
		List<Residente> residentes = residenteService.listarResidentesTela();
		Util.customizer();
		logger.log(Level.INFO, () -> residentes + "\n\nLista gerada com sucesso!");
	}
	
	public void listarResidentes() throws IOException {
		residenteService.listarResidentes();
		Util.customizer();
		logger.log(Level.INFO, () -> "\n\nRelatório gerado com sucesso!");
	}
}
