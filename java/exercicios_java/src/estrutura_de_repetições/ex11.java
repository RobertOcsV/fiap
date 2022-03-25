package estrutura_de_repetições;

import java.util.Scanner;

public class ex11 {

	
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	double base, altura, area;
	
	System.out.printf("Insira o valor da base: ");
	base = ler.nextDouble();
	
	System.out.printf("Insira o valor da altura: ");
	altura = ler.nextDouble();
	
	area = base * altura;
	
	if( area > 100 ) {
		
		System.out.printf("Terreno Grande");
		
	}

	}
	
}
