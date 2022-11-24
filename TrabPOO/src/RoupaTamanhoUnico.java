package src;

public class RoupaTamanhoUnico extends Peca implements Item{

	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMax, int estoqueMin) {
		super(descricao, quantidade, estoqueMax, estoqueMin);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reposicaoEstoque() {
		System.out.println("-------------------------------------");
		if (getEstoqueMin() >= getQuantidade()) {
			System.out.println("Reposição do estoque realizada!");
			setQuantidade(getEstoqueMax());
			System.out.println("-------------------------------------");
			
		}
		
	}

	@Override
	public void venda() {
		System.out.println("-------------------------------------");
		System.out.println("Venda realizada!");
		setQuantidade(getQuantidade() - 1);
		System.out.println("");
		//System.out.println("-------------------------------------");
		
		reposicaoEstoque();
	}

	@Override
	public void statusItem() {
		System.out.println("Descrição: " + getDescricao() + "\nQuantidade: " + getQuantidade() + "\nEstoque minimo: " + getEstoqueMin() + "\nEstoque Máximo: " + getEstoqueMax());
		
	}

}