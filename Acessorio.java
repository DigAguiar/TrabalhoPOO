package src;
import java.util.Scanner;
public class Acessorio extends Peca{

	public Acessorio(String descricao, int quantidade, int estoqueMax, int estoqueMin) {
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
		Scanner read = new Scanner (System.in);
		int aux;
		System.out.println("Quantidade: ");
		aux = read.nextInt();
		if (getEstoqueMin() <= aux) {
			
		}
		
		
	}

}
