package estrutura_de_repeti��es;

import java.util.Scanner;

public class ex12 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
			
		double area, base, altura;
		
		System.out.printf("Insira a altura do ret�ngulo: ");
		altura = ler.nextDouble();
		
		System.out.printf("Insira a base do ret�ngulo: ");
		base = ler.nextDouble();
		
		area = base * altura;
		
		if (area >= 100) {
			
			System.out.printf("Terreno Grande");
			
			
		}else if(area < 100) {
			System.out.printf("Terreno Pequeno");
			
		}
		
		

	}

}
