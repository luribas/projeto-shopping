package br.edu.up.model;

public class Cliente {
	private String nome;
	private String sobrenome;
	private String email;
	private String cpf;
	private String telefone;
	private String login;
	private String senha;
	
	public Cliente(String nome, String sobrenome, String email, String cpf, String telefone, String login, String senha){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.login = login;
		this.senha = senha;
	}
	
	public Cliente() {

	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
