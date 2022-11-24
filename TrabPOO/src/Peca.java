package src;

public abstract class Peca {

	private String descricao;
	private int quantidade;
	private int estoqueMax;
	private int estoqueMin;

	


	


	public Peca(String descricao, int quantidade, int estoqueMax, int estoqueMin) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoqueMax = estoqueMax;
		this.estoqueMin = estoqueMin;
	}



	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getEstoqueMax() {
		return estoqueMax;
	}
	public void setEstoqueMax(int estoqueMax) {
		this.estoqueMax = estoqueMax;
	}
	public int getEstoqueMin() {
		return estoqueMin;
	}
	public void setEstoqueMin(int estoqueMin) {
		this.estoqueMin = estoqueMin;
	}




}