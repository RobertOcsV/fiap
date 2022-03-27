package estrutura_de_repetições;

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
		
			/*System.out.printf("Seu sexo é masculino");*/
			
				if (peso_avaliado < 20) {
					
					System.out.printf("O senhor está abaixo do peso!: %.1f / 20", peso_avaliado );
					
				}else if(((peso_avaliado) >= 20 && peso_avaliado < 25)
						
						){
							System.out.printf("Senhor o seu peso está dentro do ideal: %.1f / 25 ", peso_avaliado);
					
						}
				else{
					System.out.printf("O senhor está acima do peso! %.1f / 25", peso_avaliado);
				}
		}else {
			
				/*System.out.printf("Seu sexo é feminino");*/
				
				if(peso_avaliado < 19) {
					
					System.out.printf("A senhorita está abaixo do peso: %.1f / 19", peso_avaliado);
					
				}else if ((peso_avaliado >= 19) && peso_avaliado < 24){
					
					System.out.printf("Senhorita, o seu peso está dentro da faixa de peso ideal: %.1f / 24", peso_avaliado);
					
				}else {
					
					System.out.printf("A senhorita está acima do peso: %.1f / 24", peso_avaliado);
					
				}
				
				
			
			}
	


		
		
		}
		
	}

	
