package principal;

import java.util.Scanner;

import entities.VerificacaoTriangulo;

public class Triangulo {

	public static void main(String[] args) {
		// Fa�a um programa que receba 3 valores e indique/retorne que tipo de triangulo ele pode ser;
		
		Scanner leia = new Scanner(System.in);
		VerificacaoTriangulo verificacaoTriangulo=new VerificacaoTriangulo();
		System.out.println("Digite o primeiro valor do tri�ngulo ");
		verificacaoTriangulo.primeiroV= leia.nextDouble();
		
		
		System.out.println("Digite o segundo  valor do tri�ngulo ");
		verificacaoTriangulo.segundoV= leia.nextDouble();
		System.out.println("Digite o terceiro valor do tri�ngulo ");
		verificacaoTriangulo.terceiroV= leia.nextDouble();
		
		verificacaoTriangulo.verifica();
		
		leia.close();

	}

}
