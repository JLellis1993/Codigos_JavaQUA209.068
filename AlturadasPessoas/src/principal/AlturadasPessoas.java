package principal;

import java.util.Scanner;

public class AlturadasPessoas {

	public static void main(String[] args) {
		// Faça um programa que receba a altura de 10 pessoas e mostre a media da altura delas
		Scanner leia = new Scanner (System.in);
		double media=0;
		double altura=0;
		
		
		for (int contador =1; contador< 11; contador++) {
			 System.out.println("Digite sua altura");
			 altura=leia.nextDouble();
			 media=media+altura;
			 }
		
		System.out.println("A media das alturas é " + (media/10));
		
		leia.close();

	}

}
