package principal;

public class ExercicioUmMatriz {

	public static void main(String[] args) {
		// fazer uma matriz 3x3 ou 4x4, imprimir os numeros 
		 //da diagonal dessa matriz;

		int [] [] numeros =new int [3] [3];
		 int contador =10;
		
		for (int i = 0; i < numeros.length; i++) { //colunas
	        	for (int j =0; j < numeros.length; j++) { //linhas
	        		if(i==j) {
	        		numeros [i] [j] = contador;
	        		System.out.print(numeros [i] [j] + "\t");
	        	  }
	        	contador++;
	               }
	        	System.out.println();
 }
}
}
