package estrutura_de_repetições;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);

		double v0, t, a, v;
		
		System.out.printf("Qual é a velocidade inicial?: ");
		v0 = ler.nextDouble();
		
		System.out.printf("Tempo percorrido(em segundos): ");
		t = ler.nextDouble();
		
		System.out.printf("Insira a aceleração:  ");
		a = ler.nextDouble();
		
		
		v = v0 + (a * t );
		
		v = v * 3.6;
		
		
		if (v <= 40) {
			System.out.printf("Veiculo muito lento %.1f /40", v);
		}else if((v > 40) && v <= 60)  {
			System.out.printf("Velocidade permitida %.1f /60", v);
		} else if ((v > 60) && v <= 80 ){
			System.out.printf("Velocidade de cruzeiro %.1f /80", v);
		} else if((v > 80) && v <= 120) {
			System.out.printf("Veiculo Rápido %.1f /120", v);
		}else{
			System.out.printf("Veiculo muito rápido %.1f - min/120", v);
		}
		
	}

}
