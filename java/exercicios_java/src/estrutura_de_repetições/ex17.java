package estrutura_de_repeti��es;

	import java.util.Scanner;

	public class ex17 {
	
	public static void main(String[] args) {	
		
		Scanner s = new Scanner (System.in);
		Scanner ler = new Scanner (System.in);
		
		
	int seu_sexo;
	double peso, altura, peso_avaliado;
	
	
	
			
		System.out.printf("\n Se for masculino, digitar 1; \n Se for feminino digitar 2: ");
		seu_sexo = ler.nextInt();
		
		System.out.printf("Digite a altura: ");
		altura = ler.nextDouble();
		
		System.out.printf("Digite o seu peso");
		peso = ler.nextDouble();
	
	peso_avaliado = peso / (altura * altura);
	
		if (seu_sexo == 1) {
		
			/*System.out.printf("Seu sexo � masculino");*/
			
				if (peso_avaliado < 20) {
					
					System.out.printf("O senhor est� abaixo do peso!: %.1f / 20", peso_avaliado );
					
				}else if(((peso_avaliado) >= 20 && peso_avaliado < 25)
						
						){
							System.out.printf("Senhor o seu peso est� dentro do ideal: %.1f / 25 ", peso_avaliado);
					
						}
				else{
					System.out.printf("O senhor est� acima do peso! %.1f / 25", peso_avaliado);
				}
		}else {
			
				/*System.out.printf("Seu sexo � feminino");*/
				
				if(peso_avaliado < 19) {
					
					System.out.printf("A senhorita est� abaixo do peso: %.1f / 19", peso_avaliado);
					
				}else if ((peso_avaliado >= 19) && peso_avaliado < 24){
					
					System.out.printf("Senhorita, o seu peso est� dentro da faixa de peso ideal: %.1f / 24", peso_avaliado);
					
				}else {
					
					System.out.printf("A senhorita est� acima do peso: %.1f / 24", peso_avaliado);
					
				}
				
				
			
			}
	


		
		
		}
		
	}

	
