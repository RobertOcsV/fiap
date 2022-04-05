package estrutura_de_repetições2;

import java.util.Scanner;

public class ex21while {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		int valor = 0;

		while (valor <= 0 ) {
						
			System.out.printf("Insira um valor positivo: ");
			valor = ler.nextInt();
		}
	}
}
