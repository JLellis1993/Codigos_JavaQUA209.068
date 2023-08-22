package Entities; 

public class Usuario {

	private String nome;
	private String email;
	private String senha;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void obterDadosUsuario () {
		System.out.println("Nome do usuario: " + nome);
		System.out.println("e-mail : " + email );
		System.out.println("senha" + senha );
	}
}
	

