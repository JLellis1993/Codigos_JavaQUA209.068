import java.util.Scanner;

public class Atividade_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura;
		char sexo;
		
		System.out.println ("Por favor digite seu nome ");
		nome=leia.nextLine();
		
		System.out.println ("Digite sua altura");
		altura= leia.nextDouble();
		
		System.out.println ("Digite a sua idade");
		idade= leia.nextInt();
		
		System.out.println("Qual o seu sexo");
		sexo= leia.next() .charAt(0);
		
		System.out.println("O nome digitado foi " + nome );
		System.out.println ("A idade digitada foi " + idade);
		System.out.println ("A altura digitada foi " + altura);
		System.out.println ("O sexo digitado foi " + sexo);
		
		leia.close ();
		
		
		
		
		
		
		
		

	}

}
