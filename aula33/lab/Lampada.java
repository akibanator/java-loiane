package com.loiane.cursojava.aula33.lab;

public class Lampada {

	private String modelo;
	private String tipo;
	private String tensao;
	private boolean ligada;

	public Lampada() {
	}

	public Lampada(String modelo, String tipo, String tensao, boolean ligada) {
		this.modelo = modelo;
		this.tipo = tipo;
		this.tensao = tensao;
		this.ligada = ligada;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public void ligarLampada() {
		System.out.println("Ligando a lâmpada");
		setLigada(true);
	}

	public void desligarLampada() {
		System.out.println("Desligando a lâmpada");
		setLigada(false);
	}

	public void verificarEstadoLampada() {
		if (isLigada()) {
			System.out.println("A lâmpada está ligada");
		} else {
			System.out.println("A lâmpada está desligada");
		}
	}

	public void trocandoEstadoLampada() {
		if (isLigada()) {
			System.out.println("Desligando a lâmpada");
			ligada = false;
		} else {
			System.out.println("Ligando a lâmpada");
			ligada = true;
		}
	}

}
