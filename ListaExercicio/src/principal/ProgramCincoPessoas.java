package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProgramCincoPessoas {

	public static void main(String[] args) {
		// Faça um programa que receba o nome de 5 pessoas e imprima na ordem alfabética 
		//(usar o Scanner, não precisa de classe);
		
		Scanner leia = new Scanner (System.in);
		ArrayList<String> nomes = new ArrayList<>();
		
		
		System.out.println("Digite o nome da primeira pessoa");
		nomes.add(leia.nextLine());
		System.out.println("Digite o nome da segunda pessoa");
		nomes.add(leia.nextLine());
		System.out.println("Digite o nome da terceira pessoa");
		nomes.add(leia.nextLine());
		System.out.println("Digite o nome da quarta pessoa");
		nomes.add(leia.nextLine());
		System.out.println("Digite o nome da quinta pessoa");
		nomes.add(leia.nextLine());
		
		System.out.println(nomes);
		
		System.out.println("Imprimindo ordenadamente: ");
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		
		
		
		
		
		leia.close();
		
	}

}
