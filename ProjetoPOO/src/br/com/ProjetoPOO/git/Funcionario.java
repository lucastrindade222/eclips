package br.com.ProjetoPOO.git;

import java.util.Scanner;

public class Funcionario implements Interface   {

	private int id;
	private char funcao;
	private float salario;
	private float jornada_de_trabalho;
	
	Scanner s1 = new Scanner(System.in);
	
	 
	@Override
	public void inserir() {
		System.out.println("Ensira o id:");
		this.setId(s1.nextInt());
		System.out.println("Fun��o exercido  P para pedreiro  E para engenheiro:");
		this.setFuncao(s1.next().charAt(0));
	    funcao();
		
	}
	@Override
	public void alterar() {
		 
		 

		}
		
	
	@Override
	public void listar() {
	 System.out.println("Id:"+this.getId());
	 System.out.println("fun��o:"+this.getFuncao());
	 System.out.println("salario:"+this.getSalario());
	 System.out.println("Jornada da Trabalho:"+this.getJornada_de_trabalho());
	 
		
	}
	@Override
	public void excluir() {
		this.setId(0);
	 	this.setJornada_de_trabalho(0);
		this.setSalario(0);
		 
		
	}
	

	
	
	public void funcao(){
		
		if( this.getFuncao() == 'p'){
			this.setSalario(1500);
			this.setJornada_de_trabalho(6.30f);
			
		}else if(this.getFuncao() == 'f') {
			this.setSalario(4243324);
			this.setJornada_de_trabalho(1);
		}
	
	
	}
	
	
	
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private char getFuncao() {
		return funcao;
	}
	private void setFuncao(char funcao) {
		this.funcao = funcao;
	}
	private float getSalario() {
		return salario;
	}
	private void setSalario(float salario) {
		this.salario = salario;
	}
	private float getJornada_de_trabalho() {
		return jornada_de_trabalho;
	}
	private void setJornada_de_trabalho(float jornada_de_trabalho) {
		this.jornada_de_trabalho = jornada_de_trabalho;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
