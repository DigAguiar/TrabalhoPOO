package src;
import java.util.Scanner;
public class Aplicacao {

	public static void main(String[] args) {
		rodando();

		
		
		
		
		
		
		
		
		
	}
	public static void rodando () {
		Scanner read = new Scanner (System.in);
		int controlador = 0;

		
		// Ordem (descri��o, quantidade,estoqueMaximo,EstoqueMinimo)
		
		
		RoupaTamanhoUnico RTU = new RoupaTamanhoUnico ("Camisas de cores basicas de tamanho unico",5,15,2); 
		RoupaPMG PMG = new RoupaPMG ("Camisas com a mesma estampa, por�m diferentes tamanhos",0,15,3);
		Acessorio cinto = new Acessorio ("O melhor cinto para segurar a sua cal�a!",6,15,2);
		Acessorio pulseira = new Acessorio ("Deixar esse seu pulso mais estileira!",6,30,2);
		Acessorio anel = new Acessorio ("Anel que n�o enferruja, e � confortavel!",7,50,2);
		boolean aux = false;

		do {
			System.out.println("1- Camisa Tamanho Unico\n2- Camisa Tamanho Variavel\n3- Cinto\n4- Pulseira\n5- Aneis\n6- Status dos itens\n7- Sair do programa ");
			controlador = read.nextInt();


			switch (controlador) {
			case 1:
				RTU.venda();
				break;
			case 2:
				PMG.venda();
				break;
			case 3:
				cinto.venda();
				break;
			case 4:
				pulseira.venda();
				break;
			case 5:
				anel.venda();
				break;
			case 6:
				System.out.println("Status camisa tamanho unico: ");
				RTU.statusItem();
				System.out.println("\nStatus camisa tamanho variavel: ");
				PMG.statusItem();
				System.out.println("\nStatus cinto: ");
				cinto.statusItem();
				System.out.println("\nStatus Pulseira: ");
				pulseira.statusItem();
				System.out.println("\nStatus Anel: ");
				anel.statusItem();
				System.out.println("");
				break;
			case 7: 
				System.out.println("tchau");
				break;
			default:
				System.out.println("Op��o invalida.");
				break;
			}


			
			if (controlador == 7) {
				aux = true;
			}

		} while (aux == false);



	}
}
