package com.loiane.cursojava.aula42;

public final class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Pessoa(String nome, String endereco, String telefone, String cpf, String telefoneCelular) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.telefoneCelular = telefoneCelular;
	}



	private String telefoneCelular;

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//public abstract String obterEtiquetaEndereco();
	
	//public abstract void imprimirEtiquetaEndereco();

}
