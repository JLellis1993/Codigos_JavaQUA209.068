package principal;

public class VinteNumeros {

	public static void main(String[] args) {
		/*Fa�a um programa que imprima na tela os n�meros de 1 a 20, um abaixo do outro. 
		 * Depois modifique o programa para que ele mostre os n�meros um ao lado do outro.
		 */

		for (int contador = 1; contador<=20; contador++) {
			System.out.println(contador);
		}
		
		for (int contador = 1; contador<=20; contador++) {
			if (contador == 1 ) { 
				System.out.print(contador);
			} else { 
				System.out.print(","+ contador);
			}
		}
		
	}

	}

