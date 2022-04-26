package encapsulamento;

public class Pessoa {

	private int id;
	private int idade;
	private String nome;
	private String email;
	private ContaBancaria conta;
	
	
	
	
	public int setId(int id) {		
		return	this.id = id; 
	}
	
	public int getId() {		
		return this.id;		
	}
	
	public int setIdade(int idade) {
		return this.idade = idade;	
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setContaBancaria(ContaBancaria conta) {
		this.conta = conta;
	}
	
	public ContaBancaria getContaBancaria() {
		return this.conta;
	}
	
	
	
	public String exibirDadosConta(){
			
		if(this.conta != null)
			return "agencia: " + this.conta.getAgencia() + "\nNum: " + this.conta.getNumero(); 
		else {
			
			return "Não tem conta";
			
		}
		
		
	}
	
	
	
	
	
	/*
	 Pessoa(int id, String nome, ContaBancaria conta){
		
		this.id = id;
		this.nome = nome;
		this.conta = conta;
		
	}
	*/
	
	
}
