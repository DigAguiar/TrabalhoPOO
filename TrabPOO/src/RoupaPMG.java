package src;
import java.util.Scanner;
public class RoupaPMG extends Peca implements Item{

	 public RoupaPMG(String descricao, int quantidade, int estoqueMax, int estoqueMin) {
		super(descricao, quantidade, estoqueMax, estoqueMin);
		this.descricao = descricao;
		this.estoqueMax = estoqueMax;
		this.estoqueMin = estoqueMin;
		
		this.quantidadeP = 10;
		this.quantidadeM = 10;
		this.quantidadeG = 10; 
	}
	
	

	private String descricao;
	private int quantidadeP;
	private int quantidadeM;
	private int quantidadeG;
	private int estoqueMin;
	private int estoqueMax;

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidadeP() {
		return quantidadeP;
	}
	public void setQuantidadeP(int quantidadeP) {
		this.quantidadeP = quantidadeP;
	}
	public int getQuantidadeM() {
		return quantidadeM;
	}
	public void setQuantidadeM(int quantidadeM) {
		this.quantidadeM = quantidadeM;
	}
	public int getQuantidadeG() {
		return quantidadeG;
	}
	public void setQuantidadeG(int quantidadeG) {
		this.quantidadeG = quantidadeG;
	}
	public int getEstoqueMin() {
		return estoqueMin;
	}
	public void setEstoqueMin(int estoqueMin) {
		this.estoqueMin = estoqueMin;
	}
	public int getEstoqueMax() {
		return estoqueMax;
	}
	public void setEstoqueMax(int estoqueMax) {
		this.estoqueMax = estoqueMax;
	}
	
	@Override
	public void reposicaoEstoque() {
		
		if (getEstoqueMin() >= getQuantidadeP()) {
			System.out.println("-------------------------------------");
			System.out.println("Reposição do estoque de camisa P!");
			setQuantidadeP(estoqueMax);
			System.out.println("-------------------------------------");
		}
		
		if (getEstoqueMin() >= getQuantidadeM()) {
			System.out.println("-------------------------------------");
			System.out.println("Reposição do estoque de camisa M!");
			setQuantidadeM(estoqueMax);
			System.out.println("-------------------------------------");
			
		} if (getEstoqueMin() >= getQuantidadeG()) {
			System.out.println("-------------------------------------");
			System.out.println("Reposição do estoque de camisa G!");
			setQuantidadeG(estoqueMax);
			System.out.println("-------------------------------------");
		}

	}
	@Override
	public void venda() {
		Scanner read = new Scanner (System.in);
		int aux = 0;
		System.out.println("Escolha o tamanho da roupa: \n(1)Tamanho P\n(2)Tamanho M\n(3)Tamanho G");
		aux = read.nextInt();
		System.out.println("-------------------------------------");
		switch (aux) {
		case 1:
			System.out.println("Camisa tamanho P escolhida, realizando venda...");
			setQuantidadeP(getQuantidadeP() - 1);
			break;
		case 2:
			System.out.println("Camisa tamanho M escolhida, realizando venda...");
			setQuantidadeM(getQuantidadeM() - 1);
			break;
		case 3:
			System.out.println("Camisa tamanho G escolhida, realizando venda...");
			setQuantidadeG(getQuantidadeG() - 1);
			break;
		default:
			System.out.println("Opção escolhida invalida.");
			break;
		}
		System.out.println("-------------------------------------");
		reposicaoEstoque();
	}
	@Override
	public void statusItem() {
		System.out.println("Descrição: " + getDescricao() + "\nQuantidade camisa P: " + getQuantidadeP() + "\nQuantidade camisa M: " + getQuantidadeM() + 
				"\nQuantidade camisa G: " + getQuantidadeG() + "\nEstoque minimo: " + getEstoqueMin() + "\nEstoque Máximo: " + getEstoqueMax());
		
	}



}