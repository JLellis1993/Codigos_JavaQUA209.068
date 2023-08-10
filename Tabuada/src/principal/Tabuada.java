package principal;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		/*Fa�a um programa que receba um operador (+, -, /, *) e um numero e mostre a tabuada conforme os dados de entrada 
		 * (numero n�o pode ser maior que 10 e nem menor que 0)
		 */
         Scanner leia = new Scanner (System.in);
         char operacao;
         int numero =0;
         
         System.out.println("Qual o tipo da opera��o (+,-,/,*)");
         operacao=leia.next().charAt(0);
         
         System.out.println("Qual o numero que deseja realizar a tabuada: ");
         numero=leia.nextInt();
        
         switch (operacao) {
        case '+':
        	for (int contador =1; contador <=10; contador ++) {
            System.out.println(numero + "+" + contador + " = " + (contador + numero ));
        	}
         break;
        case '-':
        	int aux =numero;
        	for (int contador =1; contador <=10; contador ++) {
            System.out.println(
            		(aux +  contador)+ "-" + numero + " = " + ((aux + contador) - numero )
            		);
        	}
         break;
         
         case '*':
			for(int contador = 1; contador <= 10; contador++) {
				System.out.println(numero + " * " + contador + " = " + (contador * numero));
			}
		break;
		
		case '/':
			for(int contador = 1; contador <= 10; contador++) {
				System.out.println(
				(numero * contador) + " / " + numero + " = " + (numero * contador / numero)
				);
			}
		break;

		default:
			System.out.println("Opera��o inv�lida");
			break;
		}
		
		
         leia.close();
         
         }
         }
	        
	         
