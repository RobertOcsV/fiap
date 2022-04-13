package classe_atributo;

public class Pessoa {

	public int id;
	public String nome;
	public int idade;
	public String email;
	public ContaBancaria conta;
	
	
	
	Pessoa(int id, String nome, int idade, String email, ContaBancaria conta){
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta; 
	}
	
	public void alterarEmail (String novoEmail) {
			this.email = novoEmail;
		}
	
	public String exibirNomeIdade() {
		return (this.idade + "-" + this.nome);
	}
	
	public String exibirDadosConta() {
		
		return("agencia:" + this.conta.agencia  + "\n" + "numero: " + this.conta.numero + "\n" + "saldo: " + this.conta.saldo);
		
	}
	
	
		
}
