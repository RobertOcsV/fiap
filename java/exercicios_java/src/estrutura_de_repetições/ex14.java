package estrutura_de_repetições;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, peso_ideal;
		
		System.out.printf("Digite a altura: ");
		altura = ler.nextDouble();
		
		System.out.printf("Digite o peso: ");
		peso = ler.nextDouble();
		
		peso_ideal = peso / (altura * altura);
		
		System.out.printf("o imc é: %.2f", peso_ideal);

	}
}
