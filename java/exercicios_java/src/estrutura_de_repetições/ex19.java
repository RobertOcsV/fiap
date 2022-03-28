package estrutura_de_repetições;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		
		double p1, p2, media;
		
		System.out.printf("Insira a nota do primeiro semestre (P1): ");
		p1 = ler.nextDouble();
		
		System.out.printf("Insira a nota do segundo semestre(p2): ");
		p2 = ler.nextDouble();
		
		
		media = p1 +(p2 *2);
		media = media / 3;
		
		if( media >= 5) {
			
			System.out.printf("Aprovado %.1f", media);
			
		}else {
			
			System.out.printf("Reprovado %.1f", media);
			
		}
		

	}

}
