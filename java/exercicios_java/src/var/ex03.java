package var;

	import java.util.Scanner;

public class ex03 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	double base, altura, area;
	
	System.out.printf("Informa a base do tri�ngulo: ");
	base = ler.nextInt();
	
	System.out.printf("Informe a altura do tri�ngulo: ");
	altura = ler.nextInt();
	
	area = base * altura /2;
	
	System.out.printf("a area do triangulo �: %.2f", area);
	
	
			
			
			
		
	}

}
