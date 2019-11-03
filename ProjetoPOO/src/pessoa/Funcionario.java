package pessoa;

import java.util.Scanner;

import intreface.Interface;

public class Funcionario extends Pessoa implements Interface   {

	public int id=0;
	private float salario;
	private float jornada_de_trabalho;
	private String funcao;
	private boolean estado=false;

	
	
	Scanner s1 = new Scanner(System.in);
	 
	

	@Override
	public void inserir() {
		System.out.println("______________________________________________________________");
		System.out.println("                      ||Cadastra||              \nID["+this.getId()+"]\n");
		System.out.println("inforne o nome seu nome:"); 
		this.setNome(s1.next());
		System.out.println("informe o CPF:");
		this.setCpf(s1.nextFloat());
		System.out.println("informe a data de nacimento");
		this.setData_de_nacimento(s1.next());
		System.out.println("informe a sua funçao ");
		this.setFuncao(s1.next());
		System.out.println("informe o salario");
		this.setSalario(s1.nextFloat());
		System.out.println("informe a jornada de trabalho");
		this.setJornada_de_trabalho(s1.nextFloat());
		
	 
		 
	 
	}
	@Override
	public void alterar() {
		 
		int i=0;
		System.out.println("______________________________________________________________");
		System.out.println("                      ||Altera||              \nID"+this.getId()+"\n");
		System.out.println(" o que voce deseja altera?");
		System.out.println(" nome digite:1");
		System.out.println(" CPF  digite:2");
		System.out.println(" Data de nacimento  digite:3");
		System.out.println(" Funçao  digite:4");
		System.out.println(" salario: digite:5");
		System.out.println(" jornada de Trabalho  digite:6");
		System.out.println(" Voltar ao Menu:7");
		i=s1.nextInt();
		
		
		 switch (i) {
		case 1:
			
			System.out.println("encira o novo nome: ");
			this.setNome(s1.next());
			System.out.println("Concluido com suseso ");
			System.out.println(".....................................");
		 
			break;
			
		case 2:
			System.out.println("encira o novo CPF:");
			this.setCpf(s1.nextFloat());
			System.out.println("Concluido com suseso ");
			System.out.println(".....................................");
	 
			break;
		case 3:
			System.out.println("encira o novo Data de nacimento:");
			this.setData_de_nacimento(s1.next());
			System.out.println("Concluido com suseso ");
			System.out.println(".....................................");
			 
		break;
		
		case 4:
			
			System.out.println("encira o novo Funçao:");
			this.setFuncao(s1.next());
			System.out.println("Concluido com suseso ");
			System.out.println(".....................................");
		 
			break;
			
		case 5:
			
			System.out.println("encira o novo salario:");
			this.setSalario(s1.nextFloat());
			System.out.println("Concluido com suseso ");
			System.out.println(".....................................");
			 
			break;
		case 6:
			
			System.out.println("encira o novo jornada de Trabalho:");
			this.setJornada_de_trabalho(s1.nextFloat());
			System.out.println("Concluido com suseso ");
			System.out.println(".....................................");
			 
			break;
			
		case 7:
			
			break;

		default:
			System.out.println("ERRO");
			 
			break;
		}

		}
		
	
	@Override
	public void listar() {
	 System.out.println("______________________________________________________________\n");
     System.out.println("  Id:"+this.getId());
	 System.out.println("  Nome:"+this.getNome());
	 System.out.println("  CPF:"+this.getCpf());
	 System.out.println("  data de nacimento"+this.getData_de_nacimento());
	 System.out.println("  Funçao"+this.getFuncao());
	 System.out.println("  salario:"+this.getSalario());
	 System.out.println("  Jornada da Trabalho:"+this.getJornada_de_trabalho());
	 	 
		
	}
	@Override
	public void excluir() {
		System.out.println("______________________________________________________________");
		System.out.println("                      ||Excluir||              \nID"+this.getId()+"\n");
		this.setNome(null);
	    this.setCpf(0);
        this.setData_de_nacimento(null);
		this.setId(0);
	 	this.setJornada_de_trabalho(0);
		this.setSalario(0);
		 System.out.println("exluido.....");
		
	}
	

	
	
 
	
	public void codeid(int c) {
		this.setId(c);
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	
	
	
	
	
}
