package principal;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta =new Conta ();
		ContaCorrente cc = new ContaCorrente ();
		ContaPoupanca cp = new ContaPoupanca ();
		
		System.out.println("Conta normal : ");
		conta.setTitular ("Julia");
		conta.setAgencia(5555);
		conta.setNumeroConta(5522);
		conta.depositar(150.25);
		conta.sacar(50.00);
	
		conta.obterDadosBancarios();
		System.out.println("Conta Corrente: " );
		
		cc.setTitular ("Julia");
		cc.setAgencia(5555);
		cc.setNumeroConta(5522);
		cc.depositar(550.95);
		cc.sacar(250.00);
		
		cp.setTitular ("Julia");
		cp.setAgencia(5555);
		cp.setNumeroConta(5522);
		cp.depositar(550.95);
		cp.sacar(250.00);
		
		conta.obterDadosBancarios();
	
	}

}
