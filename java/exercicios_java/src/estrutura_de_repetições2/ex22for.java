package estrutura_de_repetições2;

import java.util.Scanner;

public class ex22for {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int valor1, valor2, i;
		
		System.out.printf("Insira o valor1: ");
		valor1 = ler.nextInt();
		
		System.out.printf("Insira o valor2: ");
		valor2 = ler.nextInt();
		
		
		for (i = 0 ;valor1 > valor2; i++){
			
			if(valor2 > valor1){
			System.out.printf("valor2 é maior que valor1 ");
			}else{
				System.out.printf("valor1 maior que valor2, insira valor2 novamente: ");
				valor2 = ler.nextInt();
				
			}
				
			}
			
		}
		
		
		
		
		
		
	}


