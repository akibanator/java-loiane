package com.loiane.cursojava.aula43.labs.exer03;

public class Mamifero extends Animal {

	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public Mamifero() {
		this.setAmbiente("terra");
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nAlimento: " + this.getAlimento();
		return s;
	}

}
