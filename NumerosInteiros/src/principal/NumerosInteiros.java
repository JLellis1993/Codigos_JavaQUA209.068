package principal;

import java.util.Scanner;

public class NumerosInteiros {

	public static void main(String[] args) {
		// / Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros que est�o no intervalo compreendido por eles.
		Scanner leia = new Scanner (System.in);
		int numero1=0;
		int numero2=0;
		System.out.println("Informe o primeiro numero");
		numero1= leia.nextInt();
		System.out.println("Informe o segundo numero");
		numero2=leia.nextInt();
		while (numero2 <numero1 ) {
	    	System.out.println("Segundo n�mero deve ser maior que o primeiro");
		    numero2=leia.nextInt();
	    }
		
		for ( int contador=numero1; contador<numero2; contador++) {
			System.out.println(contador);
		}
		leia.close();
		
		
	}


	}

