package br.com.poo.individual.application;

import java.io.IOException;
import java.util.Scanner;

import br.com.poo.individual.io.RelatorioIO;

public class IndividualApplication {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		RelatorioIO.leitor("banco");
//		RelatorioIO.escritor("banco");
		sc.close();
	}
}
