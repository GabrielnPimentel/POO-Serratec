package br.com.poo.individual.application;

import java.io.IOException;

import br.com.poo.individual.io.RelatorioIO;
import br.com.poo.individual.services.MenuService;

public class IndividualApplication {

	public static void main(String[] args) throws IOException {
		RelatorioIO.leitor("banco");
		MenuService.logo();
		MenuService.menu();
	}
}
