package com.loiane.cursojava.aula33.lab;

public class Exer01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();

		lampada.setModelo("Especial");
		lampada.setTipo("Fluorescente");
		lampada.setTensao("220v");

		System.out.println("Modelo " + lampada.getModelo());
		System.out.println("Tipo: " + lampada.getTipo());
		System.out.println("Tensão: " + lampada.getTensao());

		lampada.ligarLampada();

		lampada.verificarEstadoLampada();

		lampada.desligarLampada();

		lampada.verificarEstadoLampada();

		lampada.trocandoEstadoLampada();

		lampada.verificarEstadoLampada();

	}

}
