package principal;

import java.util.Scanner;

public class ExercicioAno01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int ano = 0;
		System.out.println("Digite o ano ");
		ano= leia.nextInt();
		
		if (ano % 4 == 0  && ano % 100 ==0 && ano  %400 == 0) {
			System.out.println("É um ano bissexto");
			} else {
				System.out.println("Não é um ano bissexto");
				}
		leia.close();
		

	}

}
