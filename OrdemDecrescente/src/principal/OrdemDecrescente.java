package principal;

import java.util.Scanner;

public class OrdemDecrescente {

	public static void main(String[] args) {
		// Faça um programa que leia 3 números e imprima-os em ordem decrescente;
		Scanner leia = new Scanner (System.in);
		int numero1, numero2, numero3;
		
		System.out.println("Informe o numero 1: ");
		numero1 = leia.nextInt();
		
		System.out.println("Informe o numero 2: ");
		numero2 = leia.nextInt();
		
		System.out.println("Informe o numero 3: ");
		numero3 = leia.nextInt();

		if(numero1 > numero2 && numero1 > numero3) {
			if(numero2 > numero3) {
				System.out.println("Ordem decrescente: " + numero1 + "," + numero2 + "," + numero3 );
			} else {
				System.out.println("Ordem decrescente: " + numero1 + "," + numero3 + "," + numero2 );
			}
		} else if(numero2 > numero3 && numero2 > numero1) {
			if(numero3 > numero1) {
				System.out.println("Ordem decrescente: " + numero2 + "," + numero3 + "," + numero1 );
			} else {
				System.out.println("Ordem decrescente: " + numero2 + "," + numero1 + "," + numero3 );
			}
		} else {
			if(numero2 > numero1) {
				System.out.println("Ordem decrescente: " + numero3 + "," + numero2 + "," + numero1 );
			} else {
				System.out.println("Ordem decrescente: " + numero3 + "," + numero1 + "," + numero2 );
			}
		}
		
		leia.close();
	}



	}


