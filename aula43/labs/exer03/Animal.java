package com.loiane.cursojava.aula43.labs.exer03;

public class Animal {

	private String nome;
	private double comprimento;
	private int numPatas;
	private String cor;
	private String ambiente;
	private double velocidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		String s = "Animal: " + this.getNome();
		s += "\nComprimento: " + this.getComprimento();
		s += "\nPatas: " + this.getNumPatas();
		s += "\nCor: " + this.getCor();
		s += "\nAmbiente: " + this.getAmbiente();
		s += "\nVelocidade: " + this.getVelocidade();
		return s;
	}

}
