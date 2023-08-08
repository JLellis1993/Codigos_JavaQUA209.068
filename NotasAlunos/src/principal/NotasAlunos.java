package principal;

import java.util.Scanner;

public class NotasAlunos {

	public static void main(String[] args) {
		// Faça um programa que leia 4 notas de um aluno e retorne a media, se media for menor que 6 está reprovado, se media ficar entre 6 e 7 recuperação, se media acima de 7 aprovado, se media for 10 aprovado com honras;
		Scanner leia = new Scanner (System.in);
		double nota1= 0;
		double nota2= 0;
		double nota3= 0;
		double nota4= 0;
		double media;
		System.out.println("Digite a primeira nota: ");
		nota1= leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2= leia.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3= leia.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		nota4= leia.nextDouble();
		
		media=(nota1+nota2+nota3+nota4)/4;
		
		if(media < 6 ) {
			System.out.println("Reprovado");
		} else if(media>=6 && media < 7) { 
			System.out.println("Recuperação");
		} else if (media >=7 && media < 10 ){
			System.out.println("Aprovado");
		} else {
			System.out.println("Aprovado com honras");
		}
		
		leia.close();
	}



	}
 
