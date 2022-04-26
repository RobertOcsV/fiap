package encapsulamento;

import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Pessoa[] listaClientes = new Pessoa[2];
		
		char possuiC;
		int id, idade;
		double saldo;
		String nome, email, agencia, numero;
		ContaBancaria conta;
		
		
	
		
		for(int i=0; i <=1; i++) {
			
			Pessoa p = new Pessoa();
			
			
			System.out.printf(" \n Insira o id do cliente: ");
			id = ler.nextInt();
			p.setId(id);
			
			System.out.printf("Insira o nome do cliente: ");
			nome = ler.next();
			p.setNome(nome);
			
			System.out.printf("Insira a idade do cliente:  ");
			idade = ler.nextInt();
			p.setIdade(idade);
			
			System.out.printf("Insira o email do client:  ");
			email = ler.next();
			p.setEmail(email);
			
			System.out.printf("Possui conta ? (S) ou (N)");
			possuiC = ler.next().charAt(0);
			
			listaClientes[i] = p;
			
			if(possuiC == 'S') {
				
				ContaBancaria c = new ContaBancaria();
				
				System.out.printf("Insira a agencia: ");
				agencia = ler.next();
				c.setAgencia(agencia);
				
				
				System.out.printf("Insira o numero da conta:  ");
				numero = ler.next();
				c.setNumero(numero);
				
				System.out.printf("Insira o saldo: ");
				saldo =  ler.nextDouble();
				c.setSaldo(saldo);
				
				System.out.printf("Conta %d cadastrada com sucesso: (%s)  ", listaClientes[i].getId(), listaClientes[i].getNome() );
				
				
				p.setContaBancaria(c);		
				
					}else {
						
						conta = null;
						System.out.printf("Conta %d cadastrada com sucesso: (%s)  ", listaClientes[i].getId(), listaClientes[i].getNome() );
					}									
		      }	
		
			
			for(int i = 0; i<=1; i++) {
				
				System.out.printf(" \n Contas criadas: Pessoa (%d) Nome: %s Idade: %d Email:%s conta: %s", listaClientes[i].getId(), listaClientes[i].getNome(), 
						listaClientes[i].getIdade(), listaClientes[i].getEmail(), listaClientes[i].getContaBancaria());
				
				
			}
		
		
		
		
		
		
	}

}
