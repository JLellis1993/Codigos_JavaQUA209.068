package principal;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		// Listas trabalham com dados do mesmo tipo 
		// Uma lista é um tipo generico de uma collection 
		// uma lista é uma coleção de dados
		
			ArrayList<String> nomes = new ArrayList<>();
			
			String nome1="Adicionado por último";
			
			nomes.add("Julia");
			nomes.add("Luan");
			nomes.add("Jose");
			nomes.add("Maria");
			nomes.add(nome1);
			
			System.out.println(nomes);
			
			System.out.println(nomes.get(4));
			
			nomes.remove(1);
			System.out.println(nomes);
			
			System.out.println("Imprimindo com forEach");
			for (String nome: nomes) {
				System.out.println(nome);
			}
			System.out.println("Imprimindo com for");
			for (int i = 0; i <nomes.size(); i ++) {
				System.out.println(nomes.get(i));
			}
			System.out.println("Imprimindo com expressão lambda: ");
			//pesquisem sobre expressão lambda
			nomes.forEach(nome -> System.out.println(nome));
			
			
			System.out.println("Imprimindo ordenadamente: ");
			Collections.sort(nomes);
			
			nomes.forEach(nome -> System.out.println(nome));
			System.out.println("Ignorando case sensitive: ");
			Collections.sort(nomes, String.CASE_INSENSITIVE_ORDER);
			nomes.forEach(nome -> System.out.println(nome ));
			
	}

}
