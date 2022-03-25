package estrutura_de_repetições;

	import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {	
		
		Scanner ler = new Scanner(System.in);
		
		double cate1, cate2, hipo;
		
		System.out.printf("Insira o valor do cateto: ");
		cate1 = ler.nextDouble();
		
		System.out.printf("Insira o valor do Adjacente2: ");
		cate2 = ler.nextDouble();
		
		System.out.printf("Insira o valor da Hipotenusa: ");
		hipo = ler.nextDouble();
		
		cate1 = cate1 * cate1;
		cate2 = cate2 * cate2;
		
		if(hipo == cate1 + cate2 ){
			System.out.printf("catel %.0f + cate2 %.0f = hipo %.0f", cate1, cate2, hipo);
			
		}else {
			
			System.out.printf("Não condiz com um triângulo retângulo, "
					+ "\n os catetaos precisam ser somados e "
					+ "\n dar o mesmo valor da hipotenusa");
			
			
		}

		
		
	}

}
