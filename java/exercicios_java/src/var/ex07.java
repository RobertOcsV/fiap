package var;

	import java.util.Scanner;

public class ex07 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double prod1, prod2, prod3, prod4, prod5;
		double total, carteira;
		
		System.out.printf("Digite o preço do produto 1: ");
		prod1 = ler.nextDouble();
		
		System.out.printf("Digite o preço do produto 2: ");
		prod2 = ler.nextDouble();
		
		System.out.printf("Digite o preço do produto 3: ");
		prod3 = ler.nextDouble();
		
		System.out.printf("Digite o preço do produto 4: ");
		prod4 = ler.nextDouble();
		
		System.out.printf("Digite o preço do produto 5: ");
		prod5 = ler.nextDouble();
		
		total = prod1 + prod2 + prod3 + prod4 + prod5;
		
		System.out.printf("Digite com quanto você irá pagar: ");
		carteira = ler.nextDouble();
	
		carteira = total - carteira;
		
		System.out.printf("O seu troco deu: %.2f", carteira);
		
		
		
		
		
		
	}

}
