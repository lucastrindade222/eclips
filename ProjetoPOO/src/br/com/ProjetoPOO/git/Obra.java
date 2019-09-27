package br.com.ProjetoPOO.git;

import java.util.Scanner;

public class Obra {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		Funcionario f1 = new Funcionario();

		Scanner s2 = new Scanner(System.in);
		
		System.out.println("bla bla bla bla");
		 
		int x;
		do {

			x = 0;
			System.out.println("______________________________________________________________");
			System.out.println("                      ||Menu||                 ");
			System.out.println("cadastro Pessoa:0");
			System.out.println("cadastro Funcionario:1");
			System.out.println("sair digite:2");
			x=s2.nextInt();
			switch (x) {

			case 0:
				p1.menu();
				break;
			case 1:
				f1.menu();
				break;
			case 2:
				System.out.println("Fim...");
				break;

			}
		} while (x != 2);

	}

	 

}
