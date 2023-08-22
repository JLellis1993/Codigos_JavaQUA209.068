package Entities;

public class Estoque {

	private String produto;

	private int qntProduto;

	

	

	

	public void totalEstoque() {

		System.out.println("Nome Produto: " + produto);

		System.out.println("Quantidade: "+ qntProduto);

	}

	public String getProduto() {

		return produto;

	}

	public void setProduto(String produto) {

		this.produto = produto;

	}

	public int getQntProduto() {

		return qntProduto;

	}

	public void setQntProduto(int qntProduto) {

		this.qntProduto = qntProduto;

	}

	public void qntEmEstoque() {

		System.out.println(qntProduto);

	}

	



}
	
	

