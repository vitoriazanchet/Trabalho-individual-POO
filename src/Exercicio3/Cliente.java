package Exercicio3;

public class Cliente {
	public String nome;
	private String cpf;
	public String telefone;
	public String email;
	public String endereco;
	
	public Cliente(String nome, String cpf, String telefone, String email, String endereco){
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	public String getCpf(){
		return this.cpf;
	}
}
