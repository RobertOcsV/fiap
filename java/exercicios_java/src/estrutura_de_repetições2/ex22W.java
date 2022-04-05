package estrutura_de_repetições2;

import java.util.Scanner;

public class ex22W {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		
		int valor1, valor2;
		
		
			System.out.printf("Insira o valor1: ");
			valor1 = ler.nextInt();
			
			System.out.printf("Insira o valor2: ");
			valor2 = ler.nextInt();
			
			
			while(valor1 >= valor2) {
				
				System.out.printf("Insira o valor2 novamente: ");
				valor2 = ler.nextInt();
				
			}
		
		
	}

}
