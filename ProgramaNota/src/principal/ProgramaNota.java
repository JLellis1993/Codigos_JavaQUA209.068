package principal;

import java.util.Scanner;

public class ProgramaNota {

	public static void main(String[] args) {
		/*Fa�a um programa que pe�a uma nota, entre zero e dez.
		 * Mostre uma mensagem caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um valor v�lido.
		 */
		
		Scanner leia = new Scanner(System.in);
        double nota;
	    
	    System.out.println("Informe uma nota de 0 a 10: ");
	    nota=leia.nextDouble();
	    
	    while (nota <=0 || nota >=10) {
	    	System.out.println("Nota invalida. Informe uma nota de 0 a 10: ");
		    nota=leia.nextDouble();
	    }
	    System.out.println("Nota valida ! Valor informado: " +nota);
	    leia.close();
	}

		
		

	}

