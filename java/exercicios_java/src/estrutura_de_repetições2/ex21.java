package estrutura_de_repetições2;

	import java.util.Scanner;


public class ex21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		
		int valor; 
		
		do {
		System.out.printf("Insira um valor positivo: ");
		valor = ler.nextInt();
		}
		
		while(valor <= 0); {
			
			System.out.printf("É um valor negativo, digite novamente.");
			
		}
			
			
			
		
		
		
		
		
	}

}


