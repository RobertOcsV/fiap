	package classe_atributo;
	
	import java.util.Scanner;
	
	public class exe33 {
		
		public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		produto[] listaDeProdutos = new produto[2];
		
			for(int i=0; i<2; i++ ) {
				
				produto p = new produto();
				
				System.out.printf("Insira o id do produto: ");
				p.id = ler.nextInt();
				System.out.printf("Insira a descrição: ");
				p.descricao = ler.next();
				System.out.printf("Qual o valor do produto?: ");
				p.valor = ler.nextDouble();
				System.out.printf("quantidade desse produto: ");
				p.quantidade = ler.nextInt();
				
				listaDeProdutos[i] = p; 
				
			}
			
			System.out.printf("\n Lista dos produtos com o valor abaixo de 100 reais: ");
			
			for(int i=0; i<2; i++) {
				
				listaDeProdutos[i].valor = listaDeProdutos[i].quantidade * listaDeProdutos[i].valor;
				
				if(listaDeProdutos[i].valor <= 100) {
					
					System.out.printf("\n identificaçãoP: %d, produtoD: %s, quantidade: %d, valor: %.2f",
					listaDeProdutos[i].id , listaDeProdutos[i].descricao, listaDeProdutos[i].quantidade,listaDeProdutos[i].valor) ;
							
				}
			}
		}
		
	}
