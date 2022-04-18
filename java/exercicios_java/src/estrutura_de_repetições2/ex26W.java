package estrutura_de_repetições2;

import java.util.Scanner;

public class ex26W {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int valorA, valorB, total;
		 
		System.out.printf("Insira um valor positivo: ");
		valorA = ler.nextInt();
		
			while(valorA < 0) {
						
				System.out.printf("Erro, o número precisa ser positivo:  ");
				valorA = ler.nextInt();				
			}
			
			if(valorA > 0 ) {
				
				System.out.printf("Agora insira o segundo valor da taboada(maior que o valor 1):  ");
				valorB = ler.nextInt();
				
				while(valorA >= valorB){
					
					System.out.printf("Erro, o valor 2 precisa ser maior que (valor 1):  ");
					valorB = ler.nextInt();
																					
				}
								
				if(valorA < valorB) {
					
					while(valorA <= valorB ) {
						
						total = valorA * valorB;
						
						System.out.println(valorA +"x"+ valorB +" = "+ total);
						
						
						valorB --;
														
					}																					
				}	
			}															
 }
}
