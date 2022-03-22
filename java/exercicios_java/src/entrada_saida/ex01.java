package entrada_saida;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int base, altura, calculo;
		
		System.out.printf("Digite a base do retangulo:  ");
		base = ler.nextInt();
		
		System.out.printf("Digite a altura do retangulo:  ");
		altura = ler.nextInt();
		
		calculo = base * altura;
		
		System.out.printf("a area do retangulo é: %d", calculo);
		
	}

}