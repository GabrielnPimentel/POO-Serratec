package br.com.poo.individual.services;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.controller.HabilidadeController;
import br.com.poo.individual.controller.ResidenteController;
import br.com.poo.util.Util;

public class MenuService {

	static Logger logger = Util.setupLogger();
	static Scanner sc = new Scanner(System.in);

	ResidenteController residenteController = new ResidenteController();
	HabilidadeController habilidadeController = new HabilidadeController();
	public static final String RESET = "\u001B[0m";
	public static final String VERDE = "\u001B[32m";
	
	public static void logo() {
		System.out.println(VERDE + "    _  _                           _____                     _    _       _                            _  _   \r\n"
				+ "  _| || |_ ______ ______ ______   / ____|                   | |  | |     | |    ______ ______ ______ _| || |_ \r\n"
				+ " |_  __  _|______|______|______| | (___   ___ _ __ _ __ __ _| |__| |_   _| |__ |______|______|______|_  __  _|\r\n"
				+ "  _| || |_ ______ ______ ______   \\___ \\ / _ \\ '__| '__/ _` |  __  | | | | '_ \\ ______ ______ ______ _| || |_ \r\n"
				+ " |_  __  _|______|______|______|  ____) |  __/ |  | | | (_| | |  | | |_| | |_) |______|______|______|_  __  _|\r\n"
				+ "   |_||_|                        |_____/ \\___|_|  |_|  \\__,_|_|  |_|\\__,_|_.__/                       |_||_|  \r\n"
				+ "                                                                                                              \r\n"
				+ "                                                                                                              " + RESET);
	}

	public static void menu() throws IOException {
		
        try {
            Util.customizer();                                             
            logger.log(Level.INFO, () -> ""
                        + "Menu interativo:\n"
                        + "[1] Relatório na Tela\n"
                        + "[2] Relatório Impresso\n"
                        + "[3] Sair\n"
                        + "\nDigite uma opção: ");
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
            
            case 1:
                SubMenuService.subMenuTela();
                break;
            case 2:
                SubMenuService.subMenuImpresso();
                break;
            case 3:
                Util.customizer();
                logger.log(Level.INFO, "Volte sempre!");
                break;
            default:
                Util.customizer();
                logger.log(Level.WARNING, "Opção inválida!");
                menu();
                break;
            }
        }
        catch (InputMismatchException e) {
            logger.log(Level.INFO, "Digite uma opção válida");
        }
    }
}
