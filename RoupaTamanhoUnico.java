package src;

public class RoupaTamanhoUnico extends Peca{

	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMax, int estoqueMin) {
		super(descricao, quantidade, estoqueMax, estoqueMin);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reposicaoEstoque() {
		if (getEstoqueMin() <= getQuantidade()) {
			setQuantidade(getEstoqueMax());
			
		}
		
	}

	@Override
	public void venda() {
		
		
		
		
		reposicaoEstoque();
	}

}
