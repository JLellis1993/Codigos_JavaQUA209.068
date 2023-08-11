package principal;

import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		//  Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
		//at� 20 litros, desconto de 3% por litro �lcool
		//acima de 20 litros, desconto de 5% por litro

		//at� 20 litros, desconto de 4% por litro Gasolina
		//acima de 20 litros, desconto de 6% por litro

		//Escreva um algoritmo que leia o n�mero de litros vendidos e o tipo de combust�vel (codificado da
		//seguinte forma: A-�lcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
		//que o pre�o do litro da gasolina � R$ 5,80 e o pre�o do litro do �lcool � R$ 3,90. 

		
		
		//Scanner para fazer a leitura dos dados que o usuario vai inserir
		Scanner leia=new Scanner (System.in);
		//criar variaves para receber os valores dos combustiveis
		double valorGasolina=5.80;
		double valorAlcool=3.90;
		
		//criar uma variavel para receber a quantidade de litros
		double quantidadeLitros=0;
		
		//variavel para receber qual o tipo do combustivel
		char tipoCombustivel;
		//variavel total a pagar ja com o desconto a ser aplicado
		double totalAPagar=0;
		
		//pedir para o usuario digitar a quantidade de litros 
		//qual o tipo do combstivel para saber o valor total a ser pago
		// valida��o para que o usuario n�o digite um combustivel inv�lido
		do {
		System.out.print("Entre com o combustivel A/G: ");
		tipoCombustivel=leia.next().charAt(0);
		}while(
				Character.toUpperCase(tipoCombustivel) != 'A'
				&& Character.toUpperCase(tipoCombustivel) != 'G'
				);
		
		
		//pedir a quantidade de litros que foram abastecidos
		do {
		System.out.println("Quantos litros foram abastecidos? ");
		quantidadeLitros=leia.nextDouble();
		}while (quantidadeLitros<=0);
		
		//fazer o calculo do desconto com base na quantidade de litros 
		//que foi abastecido e o tipo de combustivel
		if (tipoCombustivel =='G') {
			if (quantidadeLitros <=20) {
				totalAPagar= (quantidadeLitros * valorGasolina);
			    totalAPagar= totalAPagar - (totalAPagar * 0.04);
			    System.out.println("Valor a ser pago com desconto: " + totalAPagar);
			    
			    
			} else {
				totalAPagar= (quantidadeLitros * valorGasolina);
			    totalAPagar= totalAPagar - (totalAPagar * 0.06);
			    System.out.println("Valor a ser pago com desconto: " + totalAPagar);
			}
		}
		if (tipoCombustivel=='A') {
			if (quantidadeLitros<=20) {
				totalAPagar= (quantidadeLitros * valorAlcool);
			    totalAPagar= totalAPagar - (totalAPagar * 0.03);
			    System.out.println("Valor a ser pago com desconto: " + totalAPagar);
			} else {
				totalAPagar= (quantidadeLitros * valorAlcool);
			    totalAPagar= totalAPagar - (totalAPagar * 0.05);
			    System.out.println("Valor a ser pago com desconto: " + totalAPagar);
			}
		}
		
		leia.close();
	}

}
