package classe_atributo;

	import java.util.Scanner;
	import java.util.Arrays;
	
public class exe32 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		cliente[] listadeClientes = new cliente[5];
		
		
		for(int i=0; i<=4; i++) {
			
			cliente c = new cliente();
			
			System.out.printf("Insira o id do cliente: ");
			c.id = ler.nextInt();
			
			System.out.printf("Insira o nome do cliente: ");
			c.nome = ler.next();
			
			System.out.printf("Insira a idade do cliente: ");
			c.idade = ler.nextInt();
			
			System.out.printf("Insira o email do cliente: ");
			c.email = ler.next();
			
			listadeClientes[i] = c;
						
		}

		System.out.printf("\n Lista dos clientes maiores de 18 anos: ");
		
		
		for(int i=0; i <= 4; i++){
			
		if(listadeClientes[i].idade >= 18){
			
			System.out.printf("\n cliente com o id: %d, cadastro feito. nome: %s, email: %s, e sua idade: %d \n "
				,listadeClientes[i].id,listadeClientes[i].nome, listadeClientes[i].email, listadeClientes[i].idade); 
					
			}
		}
		
		System.out.printf(" \n Lista dos clientes menores de 18 anos: ");
		
		for(int i=0; i <= 4; i++){
			
			if(listadeClientes[i].idade < 18){
				
				System.out.printf(" cliente com o id: %d, cadastro feito. nome: %s, email: %s, e sua idade: %d \n "
					,listadeClientes[i].id,listadeClientes[i].nome, listadeClientes[i].email, listadeClientes[i].idade); 
						
				}
			}
		
		
		
		
	}

}
