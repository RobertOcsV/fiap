package estrutura_de_repetições;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double side1, side2, side3;
		
		System.out.printf("Insira o lado1: ");
		side1 = ler.nextDouble();
		
		System.out.printf("Insira o lado2: ");
		side2 = ler.nextDouble();

		System.out.printf("Insira o lado3: ");
		side3 = ler.nextDouble();
		
		if  ( ((side1 + side2) > side3) ||
			  ((side3 + side2) > side1) ||
			  ((side1 + side3) > side2)
			) { System.out.printf(" Ok, é um triangulo! e: \n " );
				
				if ( ( ((side1 != side2) && 
						side1 != side3 && 
						side2 != side3)) 
				   ){
					
					System.out.printf("Todos os lados são diferentes, logo é um triângulo escaleno! ");
					
					
					}else if ( (side1 == side2) && 
							    side2 == side3) {
						
						System.out.printf("Todos os lados são iguais, logo é um triângulo eqüilátero!");
			
					}else{
						
						System.out.printf("Tem apenas dois lados iguais, logo é um triângulo Isósceles ");
					}
		}else {
			
			System.out.printf("Não é um triangulo, tente novamente meu chegado");
			
		}
		
	}
}
