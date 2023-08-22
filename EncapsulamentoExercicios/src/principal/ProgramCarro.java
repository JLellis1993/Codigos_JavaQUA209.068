package principal;

import java.util.Scanner;

import Entities.Carro;

public class ProgramCarro {

	public static void main(String[] args) {
		// crie um programa que receba os dados de um carro com os seguintes atributos: 
		//modelo, ano, cor, motor, cambio e velocidade e os métodos para aumentar e diminuir a velocidade; use scanner

	    Scanner leia = new Scanner (System.in);
	    Carro carro= new Carro ();
	    
	    System.out.println("Digite o modelo do carro ");
	    carro.setModelo (leia.nextLine());
	    
	    System.out.println("Digite o ano do carro ");
	    carro.setAno (leia.nextInt());
	    leia.nextLine();
	    System.out.println("Digite a cor do carro ");
	    carro.setCor (leia.nextLine());
	    System.out.println("Digite qual o cambio carro ");
	    carro.setCambio (leia.nextLine());
	    System.out.println("Digite o motor do carro ");
	    carro.setMotor (leia.nextDouble());
	    
	    carro.caracteristicasCarro();
	    leia.close();
	}

}
