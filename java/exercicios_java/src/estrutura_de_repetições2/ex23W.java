package estrutura_de_repetições2;

import java.util.Scanner;
import java.io.*;

public class ex23W {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		
		String sexo;
		
		
		
		System.out.printf("Insira o seu sexo (M) para masculino e (F) para feminino: ");
		sexo = ler.next();
		
		sexo.toUpperCase();
		
		while((sexo != 'm') || (sexo != "f") || (sexo != "M") || (sexo != "F") )     {
			
			System.out.printf("Digite o o seu sexo novamente: ");
			sexo = ler.next();
			
		}
		
		System.out.printf("seu sexo é:  " ,sexo);
		
		/*( ((sexo.equals("m")) || (sexo.equals("M")) || (sexo.equals("f")) || (sexo.equals("F")) ))*/
		
		/*
		 
		calc = sexo;
		calc = sexo - 32;		
		sexo = (char)calc;
		*/
		
		
		
			/* sexo = cin.nextLine().charAt(0); */
					
	}
	
}
