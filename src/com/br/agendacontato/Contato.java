package com.br.agendacontato;

public class Contato {
	private String nome;
	private String telefone;
	private String nascimento;
	private String celular;

	private String email;
	
	public Contato(String nome, String telefone, String nascimento, String celular, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.celular = celular;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	public String toString() {
		return "(Nome: " + nome + ", Telefone: " + telefone + ", Nascimento: " + nascimento + ", Celular: " + celular + ", Email: " + email + ")";
	}
}
