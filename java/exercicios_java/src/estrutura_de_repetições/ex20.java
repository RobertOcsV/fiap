package estrutura_de_repetições;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double p2, p1, media;
		
		media = 5;
		
		System.out.printf("Insira o valor da p1: ");
		
		p1 = ler.nextDouble();
		p2 = ((media * 3) - p1) / 2;
		
		System.out.printf("Você precisará tirar %.1f na p2 para poder passar.", p2);
		
		
		
	}

}
