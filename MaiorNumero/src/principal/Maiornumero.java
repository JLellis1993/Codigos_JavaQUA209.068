package principal;

import java.util.Scanner;

public class Maiornumero {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero1= 0;
		int numero2= 0;
		System.out.println("Digite o primeiro numero: ");
		numero1= leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		numero2= leia.nextInt();

		if(numero1 > numero2 ) {
			System.out.println("Maior numero e 1: " + numero1);
		} else { 
			System.out.println("Maior numero e 2: " + numero2);
		}
		
		leia.close();
		
		
		

	}

}
