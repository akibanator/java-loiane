package com.loiane.cursojava.aula36.labs;

public class Agenda {

	private String nome;
	private Contato[] contatos;

	public Agenda() {
	}

	public Agenda(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public String obterInfo(){
		String info;
		info = this.nome;
		for (Contato c : contatos){
			info += c.obterInfo();
		}
		return info;
	}

}
