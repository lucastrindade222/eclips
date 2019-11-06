package test;

 
 

 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pessoa.Funcionario;

 
 
 

public class Menu {

	 
	
	public   int id=0;
	private String funcao;
	private float salario;
	private float jornada_de_trabalho;
	private String nome;
	private  String Data_de_nacimento;
	private float cpf;
	
	


	Scanner s2 = new Scanner(System.in);
	

	 List<Funcionario> f1 =new ArrayList<Funcionario>();
	 
  


	int x; // menu
	int aux = 0;// variavel auxiliar.

	public void menufuncionario() {

		System.out.println("______________________________________________________________");
		System.out.println("                      ||Menu Funcionario||                 ");
		System.out.println("Cadastra:[1]");
		System.out.println("Alterar: [2]");
		System.out.println("Listar:  [3]");
		System.out.println("Excluir: [4]");
		System.out.println("Sair:    [5]");
    
		x = s2.nextInt();

		
			switch (x) {
			case 1:
             
				
				Funcionario fu = new Funcionario(); 
				fu.setId(id);
				fu.inserir();
                f1.add(fu);
                id++;
                
                menufuncionario();
               
				break;

			case 2:
				
				aux = 0;

				System.out.println("altera o utino da lista:[1]");
				System.out.println("altera o outro:[2]");
				aux = s2.nextInt();

				if (aux == 1) {
					 
					f1.get(id-1).alterar(); 
					   
				} else if (aux == 2) {
					aux = 0;
					System.out.println("informe  o ID?");
					aux = s2.nextInt();
					f1.get(aux).alterar(); 
					
				}
				  menufuncionario();
				
				break;
			case 3:


				System.out.println("Listar o ultino enserido:[1]");
				System.out.println("Listar outros:[2]");
				System.out.println("Listar todos os funcionarios cadastrados:[3]");
				aux = s2.nextInt();

				if (aux == 1) {
					
					f1.get(this.id-1).listar();; 
					 
				
				} else if (aux == 2) {
					aux = 0;
					System.out.println("informe  o ID?");
					aux = s2.nextInt();
					 f1.get(aux).listar();;
					  
				

				} else if(aux == 3) {
					
				 for (Funcionario fi : f1 ) {
					
					 fi.listar();
				}
					
				}
				
				
				 menufuncionario();
				break;
			case 4:
				aux = 0;

				System.out.println("Excluir o altual:[1]");
				System.out.println("Excluir o outro:[2]");
				aux = s2.nextInt();

				if (aux == 1) {
					
					f1.get(id-1).excluir();; 
					 
					
		    for(int x=id-1;x== f1.size() ;x++) {
						
						
						f1.get(x);
						id--;
		    }	
					
					
				} else if (aux == 2) {
					aux = 0;
					System.out.println("informe  o ID?");
					aux = s2.nextInt();
					 
					f1.get(aux).excluir();
					  
					for(int x=aux;x== f1.size() ;x++) {
						
						
						f1.get(x);
						id--;
					}
					

				}
				 menufuncionario();
				break;
			case 5:
				System.out.println("\nFIM....................");
				break;

			default:
				System.out.println("ERRO.opicao invalida");
				menufuncionario();
				break;
			}

		

	}

	 
	
	

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getJornada_de_trabalho() {
		return jornada_de_trabalho;
	}

	public void setJornada_de_trabalho(float jornada_de_trabalho) {
		this.jornada_de_trabalho = jornada_de_trabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	 

	public float getCpf() {
		return cpf;
	}

	public void setCpf(float cpf) {
		this.cpf = cpf;
	}
	
	public String getData_de_nacimento() {
		return Data_de_nacimento;
	}





	public void setData_de_nacimento(String data_de_nacimento) {
		Data_de_nacimento = data_de_nacimento;
	}

}
