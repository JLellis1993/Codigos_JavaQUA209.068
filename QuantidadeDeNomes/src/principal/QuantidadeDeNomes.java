package principal;

import java.util.Scanner;

public class QuantidadeDeNomes {

	public static void main(String[] args) {
		// Faça um programa que peça quantidade x de nomes e mostre os nomes inseridos;
		Scanner leia= new Scanner (System.in);
		int quantidade =0;
		System.out.println("Quantos nomes deseja cadastrar ?");
		quantidade =leia.nextInt();
		leia.nextLine();
		String [] nomes = new String [quantidade];
		
		for (int contador=0; contador <nomes.length; contador ++) {
			System.out.println("Digite o nome ");
			nomes[contador] = leia.nextLine();
		}
		for (String nome :nomes) {
			System.out.println(nome);
		}
		
		
		leia.close();
		
		
	}   

}
