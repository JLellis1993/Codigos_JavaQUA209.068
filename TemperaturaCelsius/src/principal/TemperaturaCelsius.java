package principal;

import java.util.Scanner;

public class TemperaturaCelsius {

	public static void main(String[] args) {
		// Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
		
		Scanner leia = new Scanner(System.in);
		double celsius = 0;
		double fahrenheit = 0;
		
		System.out.println("Digite a temperatura em celsius ");
		celsius= leia.nextDouble();
		
		
		
		
		fahrenheit= (celsius * 1.8) +32;
		System.out.println("Mostre os graus em fahrenheit " + fahrenheit );
		
		

		leia.close();
	}

}
