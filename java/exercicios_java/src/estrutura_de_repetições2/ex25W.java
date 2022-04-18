package estrutura_de_repetições2;

import java.util.Scanner;

public class ex25W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		
		int  i, l, total;
		
		
		l = 1;
		System.out.printf("Insira um valor positivo:  ");
		i = ler.nextInt();
	
		
		
		while( i < 0 ) {
		
			
			System.out.printf("O valor precisa ser positivo, digite novamente: ");
			i = ler.nextInt();
			
			if( i > 0) {
				
				while((l <= 10)) {
					
					
				
					total = i * l;
					System.out.println(i + "x" + l + " = " + total );
					l++;					
				}						
			}
		}
	}

}
