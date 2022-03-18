package var;

	import java.util.Scanner;

public class ex05 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double celsius, valorf;
		
		System.out.printf("informe a temperatura em °C: ");
		celsius = ler.nextDouble();
		
		valorf = celsius * 1.8 + 32;
		
		System.out.printf("a transformação de °F para °C foi: %.2f", valorf);
	}

}
