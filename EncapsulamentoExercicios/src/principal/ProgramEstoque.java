package principal;

import java.util.Scanner;

import Entities.Estoque;

public class ProgramEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner leia = new Scanner(System.in);
			Estoque estoque = new Estoque();
			
			System.out.println("Digite o nome do produto:");
			estoque.setProduto(leia.nextLine());
			System.out.println("Digite a quantidade do produto:");
			estoque.setQntProduto(leia.nextInt());
			
			estoque.totalEstoque();;
			
			leia.close();
		}

	}


