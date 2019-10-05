package br.com.ProjetoPOO.git;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		 
	
		
		Pessoa p[] = new Pessoa[5];
		Funcionario f[] = new Funcionario[5];

		Scanner s2 = new Scanner(System.in);
		
		
		int x;
		int c=0;
		int t=0;
		
	  do {
			 x=0;
			    System.out.println("______________________________________________________________");
		        System.out.println("                      ||Menu||                 ");
				System.out.println("Cadastra:1");
				System.out.println("Alterar:2");
				System.out.println("Listar:3");
				System.out.println("Excluir:4");
				System.out.println("Sair:5");
			
				x=s2.nextInt();
	  
			switch (x) {
			case 1:
				p[c]= new Pessoa(); 
				f[c]= new Funcionario();
				System.out.println("______________________________________________________________");
				System.out.print("ID:"+c+"");
		     	p[c].inserir();
				f[c].inserir();
				f[c].codeid(c);
				c++;
				break;
			case 2:
			   p[c-1].alterar();
			   f[c-1].alterar();
				break;
			case 3:
				
				System.out.println("listar o altual:1");
				System.out.println("listar o outro:2");
				t=s2.nextInt();
				if(t == 1) {
					 p[c-1].listar();
					 f[c-1].listar();
				}else if(t == 2) {
					t=0;
					System.out.println("informe  o ID?");
                    t=s2.nextInt();
                    p[t].listar();
					f[t].listar();
				}
				
				
				break;
			case 4:
				t=0;
				
				System.out.println("Excluir o altual:1");
				System.out.println("Excluir o outro:2");
				t=s2.nextInt();
				
				if(t==1) {
					 p[c].excluir();
					 f[c].excluir();
					 c--;
				}else if(t==2) {
					t=0;
					System.out.println("informe  o ID?");
					t=s2.nextInt();
					 p[t].excluir();
					 f[t].excluir();
					 c--;
					
				}
				
				
			    
				
				break;
			case 5:
				System.out.println("FIM...................."); 
				break;
					

			default:
				System.out.println("ERRO.opicao invalida");
				break;
			}
		  
	  }while(x != 5);
		
		
		 

	}

}
