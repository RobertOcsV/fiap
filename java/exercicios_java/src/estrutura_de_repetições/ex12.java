package estrutura_de_repetições;

import java.util.Scanner;

public class ex12 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
			
		double area, base, altura;
		
		System.out.printf("Insira a altura do retângulo: ");
		altura = ler.nextDouble();
		
		System.out.printf("Insira a base do retângulo: ");
		base = ler.nextDouble();
		
		area = base * altura;
		
		if (area >= 100) {
			
			System.out.printf("Terreno Grande");
			
			
		}else if(area < 100) {
			System.out.printf("Terreno Pequeno");
			
		}
		
		

	}

}
