import java.util.Scanner;

public class horastrabalhadas {

	public static void main(String[] args) {
		// Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s (sem descontos e impostos).

		Scanner leia = new Scanner(System.in);
		double horas = 0;
		double valorHora = 0;
		System.out.println ("Valor da hora : ");
		valorHora=leia.nextDouble();
		System.out.println("Horas trabalhadas");
		horas = leia.nextDouble();
		
		System.out.println("Total do sal�rio: " + (valorHora * horas));
		leia.close();
		
		
		
	
	}

}
