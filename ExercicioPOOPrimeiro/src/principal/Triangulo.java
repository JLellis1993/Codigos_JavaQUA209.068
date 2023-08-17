package principal;

import java.util.Scanner;

import entities.VerificacaoTriangulo;

public class Triangulo {

	public static void main(String[] args) {
		// Faça um programa que receba 3 valores e indique/retorne que tipo de triangulo ele pode ser;
		
		Scanner leia = new Scanner(System.in);
		VerificacaoTriangulo verificacaoTriangulo=new VerificacaoTriangulo();
		System.out.println("Digite o primeiro valor do triângulo ");
		verificacaoTriangulo.primeiroV= leia.nextDouble();
		
		
		System.out.println("Digite o segundo  valor do triângulo ");
		verificacaoTriangulo.segundoV= leia.nextDouble();
		System.out.println("Digite o terceiro valor do triângulo ");
		verificacaoTriangulo.terceiroV= leia.nextDouble();
		
		verificacaoTriangulo.verifica();
		
		leia.close();

	}

}
