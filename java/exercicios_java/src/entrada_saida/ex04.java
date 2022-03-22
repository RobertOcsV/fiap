package entrada_saida;

import java.util.Scanner;

public class ex04 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valor1, valor2, valor3, valor4, valores;
		
		
		System.out.printf("Digite o valor 1: ");
		valor1 = ler.nextDouble();
		
		System.out.printf("Digite o valor 2: ");
		valor2 = ler.nextDouble();
		
		System.out.printf("Digite o valor 3: ");
		valor3 = ler.nextDouble();
		
		System.out.printf("Digite o valor 4: ");
		valor4 = ler.nextDouble();
		
		
		valores = valor1 + valor2 + valor3 + valor4;
		
		valores = valores /4;
		
		System.out.printf("A média Arimética dos quatro valores é: %.2f", valores);
		
		
	}

}