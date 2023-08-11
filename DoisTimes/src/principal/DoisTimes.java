package principal;

import java.util.Scanner;

public class DoisTimes {

	public static void main(String[] args) {
		// Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
        //do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
      
		Scanner leia=new Scanner (System.in);
         String time1="";
         String time2="";
         int Goltime1=0;
         int Goltime2=0;
         
         
         
         System.out.println("Digite o nome do primeiro time");
         time1=leia.nextLine();
         
         
         System.out.println ("Digite o nome do segundo time");
         time2=leia.nextLine();
         
	
	     System.out.println("Digite o número de gols do primeiro time");
	     Goltime1=leia.nextInt();
	     
	     System.out.println("Digite o número de gols do segundo time");
	     Goltime2=leia.nextInt();
	     
	     if (Goltime1==Goltime2) {
	    	 System.out.println("Empate");
	     }
	     if (Goltime1> Goltime2) {
	    	 System.out.println(time1 + " é o Vencedor");
	     }
	     if (Goltime1<Goltime2) {
	    	 System.out.println(time2+ " é o Vencedor");
	     }
		
		
		
		
		leia.close();
	}

}
