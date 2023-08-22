package principal;

import java.util.Scanner;

import Entities.Usuario;

public class ProgramUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario ();
		Scanner sc =new Scanner (System.in);
	
		System.out.println ("Entre com o nome do usuario:" );
		usuario.setNome(sc.nextLine ());
		System.out.println("Entre om o e-mail:  ");
		usuario.setEmail(sc.nextLine());
		System.out.println("Cadastre uma senha ");
		usuario.setSenha(sc.nextLine());
	
		usuario.obterDadosUsuario();
		sc.close();
	}
	
	

}
