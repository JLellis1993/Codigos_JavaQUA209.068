package principal;

import java.util.Scanner;

public class MaiorDeTres {

	public static void main(String[] args) {
		// Faça um programa que leia 3 números e mostre o maior deles;
		Scanner leia = new Scanner (System.in);
		int numero1= 0;
		int numero2= 0;
		int numero3= 0;
		System.out.println("Digite o primeiro numero: ");
		numero1= leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		numero2= leia.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		numero3= leia.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("Maior numero e 1: " + numero1);
		} else if(numero2 > numero1 && numero2 > numero3) { 
			System.out.println("Maior numero e 2: " + numero2);
		} else {
			System.out.println("Maior numero e 3: " + numero3);	
		}
		leia.close();
		

	}
}

