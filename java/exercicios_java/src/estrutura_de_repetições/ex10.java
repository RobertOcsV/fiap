package estrutura_de_repetições;

import java.util.Scanner;

public class ex10 {
	
	

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		double valor1, valor2;
		
		System.out.printf("Insira o valor1: ");
		valor1 = ler.nextDouble();
		
		System.out.printf("Insira o valor2: ");
		valor2 = ler.nextDouble();
		
		if(valor1 > valor2) {
			System.out.printf("Valor1 maior que valor2: ");
			
		}else if(valor2 > valor1){
			
			System.out.printf("Valor2 é maior que valor1");
			
		}else{
			
			System.out.printf("Os dois valores inseridos foram iguais");
			
		}
		
		
	}
	
}
