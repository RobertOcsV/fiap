package entrada_saida;

	import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) {
		
			Scanner ler = new Scanner(System.in);
		
			int soma, lado;
			
				
			System.out.printf("Digite o lado do quadrado: ");
			lado = ler.nextInt();
			
			soma = lado * lado;
			
			
		System.out.printf("o calculo dos lados do quadrado é: %d", soma);
		
		
	}

}