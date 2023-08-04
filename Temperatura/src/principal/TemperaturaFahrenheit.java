package principal;

import java.util.Scanner;

public class TemperaturaFahrenheit {

	public static void main(String[] args) {
		//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.

		Scanner leia = new Scanner(System.in);
		double fahrenheit= 0;
		double celsius = 0;
		
		System.out.println("Digite a temperatura em Fahrenheit ");
	    fahrenheit = leia.nextDouble();
	
       
        
        celsius = 5 * ((fahrenheit - 32/9));
        System.out.println("Sua temperatura transformada em celsius " + celsius );
        leia.close();
        


  }

}
