import java.util.Scanner;

public class GastosEmpresa {

	public static void main(String[] args) {
		// Uma empresa tem gastos mensais e a cada 3 meses realiza um balan�o para verificar a media de gastos dos 3 meses. Fa�a um programa que receba os valores de cada m�s e imprima na tela o valor total gasto no per�odo e a media dos gastos.

		Scanner leia = new Scanner(System.in);
		double mes1= 0;
		double mes2 = 0;
		double mes3 =0;
		double media = 0;
		double valorTotal=0;
		
		
		System.out.println("Digite o valor do m�s1");
		mes1= leia.nextDouble();
		
		System.out.println("Digite o valor do m�s2");
		mes2= leia.nextDouble();
		
		System.out.println("Digite o valor do m�s3");
		mes3=leia.nextDouble();
		
		valorTotal= mes1+mes2+mes3;
		media = (mes1+mes2+mes3)/3;
		
		System.out.println("Valor total " + valorTotal);
		System.out.println("a media do valor total " + media);
		
		leia.close();
		
		
	
	
	}

}
