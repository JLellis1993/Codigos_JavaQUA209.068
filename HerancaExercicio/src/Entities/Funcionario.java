package Entities;

public class Funcionario {
	private String nome;
	private int idade;
	protected double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	
	public void calculaSalario(double salario) {
		this.salario= salario;
	}
	
	public void obterDadosFuncionario () { 
		System.out.println("Nome " + nome );
		System.out.println("Idade " + idade );
		System.out.println("Salário " + salario);
	}
	



}

