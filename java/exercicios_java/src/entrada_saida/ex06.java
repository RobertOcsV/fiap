package entrada_saida;

import java.util.Scanner;

public class ex06 {

public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	
	Double cotacaod, valord, reais;
	
	System.out.printf("Quantos dólares você quer converter em reais?: ");
	valord = ler.nextDouble();
	
	System.out.printf("Qual a cotação atual?: ");
	cotacaod = ler.nextDouble();
	
	reais = valord * cotacaod;
	
	System.out.printf("O seu dinheiro em dólares para reais foi: %.2f", reais);

	
	
	
}

}
