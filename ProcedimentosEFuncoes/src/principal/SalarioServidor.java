package principal;

import java.util.Scanner;

public class SalarioServidor {

	public static void main(String[] args) {
		//2) Fa�a um programa que receba o salario e a quantidade de venda total que o vendedor fez
		//no mes, e calcule o salario do m�s. H� tamb�m o desconto de 5% de inss e 11% de IRPF
		//sobre o salario bruto.

		//Se o vendedor possui o total de venda acima de 20 mil no m�s, ele recebe uma bonifica��o
		//de 5% sobre o valor das vendas;

		//Se o vendedor possui o total de venda entre 15 e 20 mil reais, recebe uma bonifica��o de
		//3% no valor da venda;

		//Se o vendedor possui o total de venda entre 10 e 15 mil reais, recebe uma bonifica��o de
		//1% no valor da venda;

		//Se o valor n�o passar de 10 mil, imprima uma frase motivacional;

Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu sal�rio bruto:");
		double salario = leia.nextDouble();
		System.out.println("Digite a quantidade de venda: ");
		double qntVenda = leia.nextDouble();
		double salarioFinal = 0;
		
		if(qntVenda > 20000) {
			salarioFinal = salarioLiquido(salario) * 0.05;
			System.out.println("Voc� teve uma bonifica��o de 5%!" + salarioFinal);
			
		}else
		if(15000 < qntVenda && qntVenda < 20000 ) {
			salarioFinal = salarioLiquido(salario) * 0.03;	
			System.out.println("Voc� teve uma bonifica��o de 3%!" + salarioFinal);
		}else
		if(10000 < qntVenda && qntVenda < 15000) {
			salarioFinal = salarioLiquido(salario) * 0.01;
			System.out.println("Voc� teve uma bonifica��o de 1%! " + salarioFinal);
			
		}else {
			System.out.println("Vamos melhorar!Voc� consegue!");
		}
		
		System.out.println("Seu sal�rio bruto: " + salario);
		System.out.printf("Seu sal�rio Liquido com os descontos: %.2f" , salarioLiquido(salario) );
		System.out.printf("\nSeu sal�rio final: %.2f", salarioLiquido(salario)+ salarioFinal);
		
		leia.close();
	}
	static double salarioLiquido(double salario) {
		double descInss = salario * 0.05;
		descInss = salario - descInss;
		
		double descIR = salario * 0.11;
		descIR = salario - descIR;
		
		double salarioFinal = (descInss + descIR) - salario;
		
		return salarioFinal ;
		
	}
}