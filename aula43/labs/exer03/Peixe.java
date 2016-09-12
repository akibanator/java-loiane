package com.loiane.cursojava.aula43.labs.exer03;

public class Peixe extends Animal {

	private String caracteristicas;

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Peixe() {
		this.setNumPatas(0);
		this.setAmbiente("mar");
		this.setCor("cinzento");
	}

	@Override
	public String toString() {
		String s = super.toString();
				s += "\nCaracterística: " + this.getCaracteristicas();
		return s;
	}

}
