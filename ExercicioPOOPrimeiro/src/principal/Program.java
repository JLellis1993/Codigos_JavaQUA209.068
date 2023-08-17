package principal;

import java.util.Scanner;

import entities.MetroQuadrado;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        MetroQuadrado metroQuadrado= new MetroQuadrado();  
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a largura: ");
		metroQuadrado.lar = leia.nextDouble();
		System.out.println("Digite O Comprimento: ");
		metroQuadrado.comp = leia.nextDouble();
		
		metroQuadrado.calculoMetroQuadrado();
		System.out.printf("Metros quadrados do terreno: %.2f " ,  metroQuadrado.Mquadrado);
		
		leia.close();
		
	}
	

	}


