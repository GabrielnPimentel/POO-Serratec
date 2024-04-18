package br.com.poo.individual.services;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.controller.HabilidadeController;
import br.com.poo.individual.controller.ResidenteController;
import br.com.poo.util.Util;

public class SubMenuService {
	
	static Logger logger = Util.setupLogger();
	static Scanner sc = new Scanner(System.in);
	
	public static void subMenuTela() throws IOException{
		
		ResidenteController residenteController = new ResidenteController();
		HabilidadeController habilidadeController = new HabilidadeController();
		
		Util.customizer();
		logger.log(Level.INFO, () -> "" 
                + "Relatórios na tela:\n" 
                + "[1] Listar Residentes cadastrados\n"
                + "[2] Listar Habilidades cadastradas\n"
                + "[3] Voltar\n" 
                + "\nDigite uma opção:");
        
		int opcao = MenuService.sc.nextInt();

        switch (opcao) {

        case 1:
            Util.customizer();
			logger.log(Level.INFO, "Lista de Residentes");
			residenteController.listarResidentesTela();
			logger.log(Level.INFO, "\n\n");
            subMenuTela();
            break;
        case 2:
            Util.customizer();
			logger.log(Level.INFO, "Lista de Habilidades");
			habilidadeController.listarHabilidadesTela();
			logger.log(Level.INFO, "\n\n");
            subMenuTela();
            break;
        case 3:
            MenuService.menu();
            break;
        default:
            Util.customizer();
            logger.log(Level.WARNING, "Opção inválida!");
            subMenuTela();
            break;
        }
	}

	public static void subMenuImpresso() throws IOException{
		
		ResidenteController residenteController = new ResidenteController();
		HabilidadeController habilidadeController = new HabilidadeController();
		
        Util.customizer();
        logger.log(Level.INFO, () -> "" 
                    + "Relatório Impresso:\n" 
                    + "[1] Criar relatório de Residentes cadastrados\n"
                    + "[2] Criar relatório de Habilidades cadastradas\n" 
                    + "[3] Voltar\n" 
                    + "\nDigite uma opção:");

        int opcao = MenuService.sc.nextInt();

        switch (opcao) {

        case 1:
            Util.customizer();
			logger.log(Level.INFO, "Relatório de Residentes");
			residenteController.listarResidentes();
			subMenuImpresso();
            break;
        case 2:
            Util.customizer();
			logger.log(Level.INFO, "Relatório de Habilidades");
			habilidadeController.listarHabilidades();
			subMenuImpresso();
            break;
        case 3:
            MenuService.menu();
            break;
        default:
            Util.customizer();
            logger.log(Level.INFO, "Opção inválida!");
            subMenuTela();
        }
	}
}
