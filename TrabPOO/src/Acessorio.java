package src;
import java.util.Scanner;
public class Acessorio extends Peca implements Item{

	public Acessorio(String descricao, int quantidade, int estoqueMax, int estoqueMin) {
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
		Scanner read = new Scanner (System.in);
		int aux;
		System.out.println("Quantidade: ");
		aux = read.nextInt();
		if (getQuantidade() < aux) {
			System.out.println("Não foi possivel realizar a compra! Quantidade pedida indisponivel");
			setQuantidade(getEstoqueMax());
		}else {
			System.out.println("Compra realizada!");
			setQuantidade(getQuantidade() - aux);
		}
		System.out.println("-------------------------------------");
		reposicaoEstoque();
	}

	@Override
	public void statusItem() {
		System.out.println("Descrição: " + getDescricao() + "\nQuantidade: " + getQuantidade() + "\nEstoque minimo: " + getEstoqueMin() + "\nEstoque Máximo: " + getEstoqueMax());
		
	}

}