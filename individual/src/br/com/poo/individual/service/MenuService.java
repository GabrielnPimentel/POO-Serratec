package br.com.poo.individual.service;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.controller.HabilidadeController;
import br.com.poo.util.Util;

public class MenuService {

	static Logger logger = Util.setupLogger();
	static Scanner sc = new Scanner(System.in);

	public static void menu() {
		Util.customizer();
		logger.log(Level.INFO,
				() -> "" + "Menu interativo:" + "[1]\tListar Residentes" + "[2]\tListar Habilidades"
						+ "[3]\tListar os Residentes e suas habilidades" + "[4]\tCadastrar Residente"
						+ "[5]\tCadastrar Habilidade" + "[0]\tSair" + "\n\nDigite uma opção: ");

		int opcao = sc.nextInt();

		switch (opcao) {
		case 1: {
			Util.customizer();
			logger.log(Level.INFO, "Lista de Habilidades");
			HabilidadeController.listarHabilidades();
			logger.log(Level.INFO, "\n\n");
			menu();
		}
			break;
		case 2: {

		}
			break;
		case 3: {

		}
			break;
		case 4: {

		}
			break;
		case 5: {

		}
			break;

		case 0:{
			Util.customizer();
			logger.log(Level.INFO, "Até a próxima!");
			break;
		}
		default:
			Util.customizer();
			logger.log(Level.INFO, "Opção inválida!");
			menu();
			break;
		}
	}
}
