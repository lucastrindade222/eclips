package br.com.ProjetoPOO.git;

import java.util.Scanner;

public class Pessoa extends Funcionario implements Interface {

	private String nome;
	private String data_de_nacimento;
	private float cpf;

	
	Scanner s1 = new Scanner(System.in);
	
	

	@Override
	public void inserir() {
		
        System.out.println("                      ||Cadastro||                \n ");
        System.out.println("informe o nome:");
		this.setNome(s1.next());
		System.out.println("informe a data de nacimento:");
		this.setData_de_nacimento(s1.next());
		System.out.println("informe o CPF:");
		this.setCpf(s1.nextFloat());
		
	}

	

	@Override
	public void alterar() {
		
		int x=0;
		System.out.println("______________________________________________________________");
        System.out.println("                      ||Alterar||                 ");
		System.out.println("altera nome:1");
		System.out.println("altera data de nacimento:2");
		System.out.println("altera CPF:3");
		x=s1.nextInt();
		 
	
		switch (x) {
		case 1:
			System.out.println("insira o novo nome:");
		     this.setNome(s1.next());
			 
			break;
		case 2:
			System.out.println("insira a nova data de nacimento:");
		    this.setData_de_nacimento(s1.next());
			break;
			
		case 3:
			System.out.println("insira o novo CPF:");
			this.setCpf(s1.nextFloat());
		 
			break;
		default:
			System.out.println("ERRO.opicao invalida");
			break;
		}		
		
	}

	@Override
	public void listar() {
		 System.out.println("______________________________________________________________");
         System.out.println("                      ||Estado atual||                 ");

		 System.out.println("nome:"+this.getNome());
		 System.out.println("Data de nacimento:"+this.getData_de_nacimento());
		 System.out.println("CPF:"+this.getCpf());
		
	}

	@Override
	public void excluir() {
		System.out.println("Excluindo......");
		this.setNome(null);
		this.setData_de_nacimento(null);
		this.setCpf(0);
		System.out.println("Finalizado");
		
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
