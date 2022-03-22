package estrutura_de_repetições;

	import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		double valor1, valor2;
		
		System.out.printf("Digite o valor1: ");
		valor1 = ler.nextDouble();
		
		System.out.printf("Digite o valor2: ");
		valor2 = ler.nextDouble();
		
		if(valor1 < valor2){
		System.out.printf("Valor1 é menor que valor2", valor1, valor2 );
		
		}else if (valor1 < valor2){
			
			System.out.printf("Valor1 é menor que valor2", valor1, valor2 );
			
		}
	}

}