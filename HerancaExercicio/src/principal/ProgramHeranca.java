package principal;

import java.util.Scanner;

import Entities.Chefia;
import Entities.Funcionario;

public class ProgramHeranca {

	public static void main(String[] args) {
		// Crie uma programa que fa�a o cadastro de funcion�rios, se o funcion�rio tiver um cargo de chefia ele 5% de bonifica��o sobre o salario bruto. 
		//Mostre os dados dos funcion�rios cadastrados, salario bruto, idade, e quando houver, imprima o salario com o valor da bonifica��o descrito;

		Scanner leia = new Scanner (System.in);
		String nome;
		double salario;
		int idade; 
		char cargo;
		char continua;
		do {
			System.out.println("Informe seu cargo: c-chefia f-funcion�rio ");
			cargo=leia.next().charAt(0);
			System.out.println("Informe o nome: ");
			nome=leia.next();
			System.out.println("Informe o sal�rio ");
			salario=leia.nextDouble();
			System.out.println("Informe sua idade ");
			idade=leia.nextInt();
			
			if (cargo== 'c') {
				Chefia chefia = new Chefia();
				chefia.calculaSalario(salario);
				chefia.setIdade(idade);
				chefia.setNome(nome);
				chefia.obterDadosFuncionario();
			} else {
				Funcionario funcionario = new Funcionario();
				funcionario.calculaSalario(salario);
				funcionario.setIdade(idade);
				funcionario.setNome(nome);
				funcionario.obterDadosFuncionario();
			}	
			System.out.println("Deseja informar outro funcion�rio? s-sim n- n�o ");
			continua=leia.next().charAt(0);
		} while (continua == 's');
		
		
		leia.close();
	}


	
	
	}


