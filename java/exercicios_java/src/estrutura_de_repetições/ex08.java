package estrutura_de_repetições;

	import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		double valor1, valor2;
		
		System.out.printf("Digite o valor1: ");
		valor1 = ler.nextDouble();
		
		System.out.printf("Digite o valor2: ");
		valor2 = ler.nextDouble();
		
		if (valor1 > valor2){
		
		System.out.printf("Valor1 é maior que valor2");
		}else if( valor1 < valor2  ){
			
			System.out.printf("Valor 2 é maior que valor1");
			
			}else {
				
				System.out.printf("valor1(%.1f) e valor2(%.1f) claramente são iguais", valor1, valor2);
			}
	}

}
