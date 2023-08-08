package principal;

import java.util.Scanner;

public class Sexo {

	public static void main(String[] args) {
		// Faça um programa que receba o sexo de uma pessoa e imprima na tela o sexo digitado, o programa não pode distinguir de maiúsculas e minúsculas;
		Scanner leia = new Scanner (System.in);
		char sexo;
		
		System.out.println("Digite o sexo M ou F:");
		sexo= leia.next().charAt(0);
		
		if (sexo=='M' || sexo== 'm') {
			System.out.println("Pessoa do sexo masculino");
		} else if (sexo=='F' || sexo== 'f') {
			System.out.println("Pessoa do sexo feminino");
		} else {
			System.out.println("Pessoa sem sexo definido");
		}
		
		leia.close();
		

	}

}


