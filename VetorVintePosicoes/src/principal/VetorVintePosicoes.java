package principal;

import java.util.Scanner;

public class VetorVintePosicoes {

	public static void main(String[] args) {
		/*
		 * Um vetor de 20 posicoes
		 * mostrar os numeros inseridos
		 * somar os numeros inseridos
		 */
		Scanner leia= new Scanner (System.in);
		int [] numeros =new int [5];
		int soma =0;
		
		//i=iterador mesmo que o contaodr 
		for (int i =0; i < numeros.length; i++) {
			System.out.println("Entre o numero: ");
		numeros [i]=leia.nextInt();
		while (numeros [i] < 0) {
			System.out.println("Numero inválido");
			System.out.println("Entre o numero: ");
		numeros [i] =leia.nextInt();
		}
        soma += numeros[i];
        
	}
		System.out.println("A soma dos numeros:  " + soma );
		System.out.println("Numeros digitados ");
	    for (int numero: numeros ) {
	    	System.out.println(numero);
	    }
	
	}
}
	
