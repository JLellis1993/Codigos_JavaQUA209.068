package principal;

import java.util.Scanner;

public class ConversaoDolar {

	public static void main(String[] args) {
		//Faça um programa que receba um valor em real e converta para dólares na cotação atual,
		//faça o inverso também;
	
		Scanner sc =new Scanner (System.in);
		System.out.println("Digite o valor real: ");
		double real = sc.nextDouble();
		
		System.out.printf("Convertido para dólar : %.2f", conversao(real));
		
	
		
		
		sc.close();
		
	
	}
	static double conversao (double real) {
		return real *4.99;
	}

}
