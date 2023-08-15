package principal;

import java.util.Scanner;

public class CalcularMetroQuadrado {

	public static void main(String[] args) {
		// Crie um programa que receba os valores 
		// de largura e comprimento do terreno 
		// e informa quantos metros quadrados ele tem 
		//utilize função 
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Entre com o valor da largura : ");
		double largura = sc.nextDouble();
		
		System.out.println("Entre com o valor do comprimento : ");
		double comprimento = sc.nextDouble();
	
        System.out.printf("O terreno tem: %.2f metros quadrados", 
        		calculaAreaTerreno(largura, comprimento) );	
	sc.close();
	}

       static double calculaAreaTerreno (double largura, double comprimento) {
       return largura * comprimento;
       }
       }
