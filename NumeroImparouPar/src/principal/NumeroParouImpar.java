package principal;

import java.util.Scanner;

public class NumeroParouImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero =0;
		System.out.println("Digite um n�mero");
		numero =leia.nextInt();
		
		if (numero %2 == 0) {
			System.out.println("� um n�mero par ");
		}else {
			System.out.println("� um n�mero �mpar");
		}
		leia.close();

	}

}
