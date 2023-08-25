package principal;

import entities.Funcionario;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa ();
		Funcionario funcionario = new Funcionario ();
		
		pessoa.setNome("Julia");
		pessoa.setAltura(1.73);
		pessoa.setCpf("172.821.900-87");
		pessoa.setGenero("Feminino");
		pessoa.setIdade(29);
		
		System.out.println(pessoa);
		System.out.println("Dados Pessoais empresa:   ");
		funcionario.setNome("Julia");
		funcionario.setAltura(1.73);
		funcionario.setCpf("172.821.900-87");
		funcionario.setGenero("Feminino");
		funcionario.setIdade(29);
		funcionario.setSalario(2753.99);
		funcionario.setEmpresa("Sesi-Senai");
		System.out.println(funcionario);
	}

}
