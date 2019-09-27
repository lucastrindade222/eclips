package br.com.ProjetoPOO.git;

import java.util.Scanner;

public class Pessoa implements Funcionario_interface {

	private String nome;
	private String data_de_nacimento;
	

	private float cpf;

	Scanner s1 = new Scanner(System.in);

	@Override
	public void menu() {
		int x;
		do {

			x = 0;
           System.out.println("______________________________________________________________");
           System.out.println("                      ||Menu Pessoa||                 ");
			System.out.println("cadastro digite :0");
			System.out.println("status digite :1");
			System.out.println("voltar digite:2");
			x = s1.nextInt();

			switch (x) {

			case 0:
				cadastro();
				break;
			case 1:
				status();
				break;
			case 2:
				System.out.println("Fim...");
				break;

			}
		} while (x != 2);

	}

	
	private void cadastro() {
		 System.out.println("______________________________________________________________");
         System.out.println("                      ||Cadastro||                 ");

		System.out.println("informe o nome:");
		this.setNome(s1.next());
		System.out.println("informe a data de nacimento:");
		  this.setData_de_nacimento(s1.next());
		System.out.println("informe o CPF:");
		this.setCpf(s1.nextFloat());

	}

	private void status() {
		 System.out.println("______________________________________________________________");
         System.out.println("                      ||Estatus atual||                 ");

		 System.out.println(this.getNome());
		 System.out.println(this.getCpf());
		 System.out.println(this.getData_de_nacimento());
		 
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	 

	private float getCpf() {
		return cpf;
	}

	private void setCpf(float cpf) {
		this.cpf = cpf;
	}
	private String getData_de_nacimento() {
		return data_de_nacimento;
	}


	private void setData_de_nacimento(String data_de_nacimento) {
		this.data_de_nacimento = data_de_nacimento;
	}

}
