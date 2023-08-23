package Entities;


	public class Chefia extends Funcionario {

		@Override
		public void calculaSalario(double salario) {
			this.salario = salario + (salario * 0.05); 
		}
	}





