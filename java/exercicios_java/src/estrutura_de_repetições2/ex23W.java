package estrutura_de_repeti��es2;

import java.util.Scanner;
import java.io.*;

public class ex23W {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Scanner cin = new Scanner(System.in);

		
		char sexo;
		
		System.out.printf("Insira o seu sexo (M) para masculino e (F) para feminino: ");
		sexo = cin.nextLine().charAt(0);
		
			while(sexo.equals) {
			
				if(sexo =='F') {
					
					System.out.printf("Seu sexo � feminino");
					break;
				}else if (sexo == 'M') {
					System.out.printf("Seu sexo � masculino");
					break;
				}else {
					System.out.printf("Valor inv�lido, Insira (M) ou (F) ");
					sexo = cin.nextLine().charAt(0);
				}	
			}
		
			System.out.printf("FIM");

	}

}
