package entities;

public class VerificacaoTriangulo {

	public double primeiroV;
	public double segundoV;
	public double terceiroV;
	
	
	
		public void verifica () {
			if (primeiroV !=segundoV && segundoV!= terceiroV) {
				System.out.println("Trata-se de um tri�ngulo escaleno ");
			}else if (primeiroV ==segundoV && segundoV == terceiroV) {
				System.out.println("Trata-se de um tri�ngulo equil�tero ");
			} else {
				System.out.println("Trata-se de um tri�ngulo is�sceles ");
			}
		   		
		}
		
}
