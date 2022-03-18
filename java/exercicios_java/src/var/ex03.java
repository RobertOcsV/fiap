package var;

	import java.util.Scanner;

public class ex03 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	double base, altura, area;
	
	System.out.printf("Informa a base do triângulo: ");
	base = ler.nextInt();
	
	System.out.printf("Informe a altura do triângulo: ");
	altura = ler.nextInt();
	
	area = base * altura /2;
	
	System.out.printf("a area do triangulo é: %.2f", area);
	
	
			
			
			
		
	}

}
