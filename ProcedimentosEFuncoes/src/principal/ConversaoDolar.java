package principal;

import java.util.Scanner;

public class ConversaoDolar {

	public static void main(String[] args) {
		//Fa�a um programa que receba um valor em real e converta para d�lares na cota��o atual,
		//fa�a o inverso tamb�m;
	
		Scanner sc =new Scanner (System.in);
		System.out.println("Digite o valor real: ");
		double real = sc.nextDouble();
		
		System.out.printf("Convertido para d�lar : %.2f", conversao(real));
		
	
		
		
		sc.close();
		
	
	}
	static double conversao (double real) {
		return real *4.99;
	}

}
