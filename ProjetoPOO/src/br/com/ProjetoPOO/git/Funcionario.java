package br.com.ProjetoPOO.git;

public class Funcionario  extends Pessoa implements Funcionario_interface  {

	private int id;
	private String funcao;
	private float salario;
	private float jornada_de_trabalho;
	
	
	
	@Override
	public void menu() {
		int x;
		do {
              
			x = 0;
           System.out.println("______________________________________________________________");
           System.out.println("                      ||Menu Funcionario||                 ");
			System.out.println("cadastro digite :0");
			System.out.println("status digite :1");
			System.out.println("voltar digite:2");
			x = s1.nextInt();

			switch (x) {

			case 0:
				 
				break;
			case 1:
				 
				break;
			case 2:
			 
				break;

			}
		} while (x != 2);

	}
	
	

	
	
	
	
	
	
	
	
	
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private String getFuncao() {
		return funcao;
	}
	private void setFuncao(String funcao) {
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
