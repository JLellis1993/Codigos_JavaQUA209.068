package principal;

import java.util.Scanner;

public class ConversaoDolar {

	public static void main(String[] args) {
		//Fa�a um programa que receba um valor em real e converta para d�lares na cota��o atual,
		//fa�a o inverso tamb�m;
	
		Scanner sc =new Scanner (System.in);
		System.out.println("Digite o valor real: ");
		double real = sc.nextDouble();
		
		System.out.printf("Convertido para d�lar : %.2f", conversaodolar(real));
		
	
		System.out.println("Digite o valor em dolar: ");
		double dolar = sc.nextDouble();
		
		System.out.printf("Convertido para real : %.2f", conversaoreal(dolar));
		
		sc.close();
		
	
	}
	static double conversaodolar (double real) {
		return real *4.99;
	
	}
	static double conversaoreal (double dolar) {
		return dolar /4.99;

}
}