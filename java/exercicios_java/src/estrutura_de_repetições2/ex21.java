package estrutura_de_repetições2;

	import java.util.Scanner;


public class ex21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		
		int valor; 
		
		do {
		System.out.printf("\n  Insira um valor positivo:    " );
		valor = ler.nextInt();
		
		if(valor <= 0){
			System.out.printf(" Erro, número negativo! error404");
			
		}
			
		}
		
		while(valor <= 0); {
			
			System.out.printf("Certo, é um valor positivo.");
			
		}
			
		
		
		
		
	}

}


