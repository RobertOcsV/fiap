package estrutura_de_repetições;

	import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Double valor1, valor2, valor3;
		
		System.out.printf("Insira o valor1: ");
		valor1 = ler.nextDouble();
		
		System.out.printf("Insira o valor2: ");
		valor2 = ler.nextDouble();
		
		System.out.printf("Insira o valor3: ");
		valor3 = ler.nextDouble();
		
		if (valor1 > valor2 && valor1 > valor3) {
			
			System.out.printf("Valor1 é o maior deles");
						
		}else if(valor2 > valor1 && valor2 > valor3){
			
				System.out.printf("Valor2 é o maior deles");
		
		}else{
			
			System.out.printf("Valor3 é o maior deles");
				
		}
	}
}
