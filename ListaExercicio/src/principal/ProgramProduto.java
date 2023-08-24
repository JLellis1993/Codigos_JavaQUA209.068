package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import entities.Produto;

public class ProgramProduto {

	public static void main(String[] args) {
		//Faça um programa que receba o nome de 3 produtos, quantidade e preço, 
		//faça com que imprima na ordem alfabética e depois imprima por quantidade;
		
		Scanner leia = new Scanner (System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		Produto produto1= new Produto();
		Produto produto2= new Produto();
		Produto produto3= new Produto();
		
		
		System.out.println("Digite o nome do primeiro produto");
		produto1.setProduto(leia.next());
		System.out.println("Digite a quantidade do primeiro  produto");
		produto1.setQuantidade(leia.nextInt());
		System.out.println("Digite o preço do primeiro produto");
		produto1.setPreco(leia.nextDouble());
		
		produtos.add(produto1);
		
		System.out.println("Digite o nome do segundo produto");
		produto2.setProduto(leia.next());
		System.out.println("Digite a quantidade do segundo  produto");
		produto2.setQuantidade(leia.nextInt());
		System.out.println("Digite o preço do segundo produto");
		produto2.setPreco(leia.nextDouble());
		
		produtos.add(produto2);
		
		System.out.println("Digite o nome do terceiro produto");
		produto3.setProduto(leia.next());
		System.out.println("Digite a quantidade do terceiro  produto");
		produto3.setQuantidade(leia.nextInt());
		System.out.println("Digite o preço do terceiro produto");
		produto3.setPreco(leia.nextDouble());
		
		produtos.add(produto3);
		
		System.out.println("Imprimndo ordenamente por nome ");
		Collections.sort(produtos, Comparator.comparing(Produto::getProduto));
		
		for (Produto produto: produtos) {
			System.out.println("Produto:  " + produto.getProduto());
			System.out.println("Quantidade " + produto.getQuantidade());
			System.out.println("Preço " + produto.getPreco());
		}
		
		System.out.println("Imprimndo ordenamente por nome ");
		Collections.sort(produtos, Comparator.comparing(Produto::getProduto));
		
		for (Produto produto: produtos) {
			System.out.println("Produto:  " + produto.getProduto());
			System.out.println("Quantidade " + produto.getQuantidade());
			System.out.println("Preço " + produto.getPreco());
		}
			
		
		leia.close();  
	
	}

}
