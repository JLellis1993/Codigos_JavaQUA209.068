package principal;

import java.util.Scanner;

public class ExercicioAno01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int ano = 0;
		System.out.println("Digite o ano ");
		ano= leia.nextInt();
		
		if (ano % 4 == 0  && ano % 100 ==0 && ano  %400 == 0) {
			System.out.println("� um ano bissexto");
			} else {
				System.out.println("N�o � um ano bissexto");
				}
		leia.close();
		

	}

}
