package entrada_saida;

import java.util.Scanner;

public class ex06 {

public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	
	Double cotacaod, valord, reais;
	
	System.out.printf("Quantos d�lares voc� quer converter em reais?: ");
	valord = ler.nextDouble();
	
	System.out.printf("Qual a cota��o atual?: ");
	cotacaod = ler.nextDouble();
	
	reais = valord * cotacaod;
	
	System.out.printf("O seu dinheiro em d�lares para reais foi: %.2f", reais);

	
	
	
}

}
