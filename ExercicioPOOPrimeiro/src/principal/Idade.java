package principal;

import java.util.Scanner;

import entities.CalculoIdade;

public class Idade {

	public static void main(String[] args) {
		// Faça um programa que receba o nome e o ano de nascimento e retorne a idade atual do usuário;
		
		
		Scanner leia = new Scanner(System.in);
		 CalculoIdade calculoIdade =new CalculoIdade();
		 String nome="";
		 
		 
		 System.out.println("Digite seu nome : ");
		 nome=leia.next();
		 System.out.println("Digite o ano atual: ");
		 calculoIdade.anoAtual= leia.nextInt();
		 System.out.println("Digite seu ano de nascimento : ");
		calculoIdade.anoNascimento =leia.nextInt();
		
		System.out.println ("Seu nome: " + nome + " sua idade é:" + calculoIdade.calculando());
		
		leia.close();

	}

}
