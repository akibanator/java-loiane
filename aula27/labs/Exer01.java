package com.loiane.cursojava.aula27.labs;

public class Exer01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.modelo = "Lampada Teste";
		
		System.out.println(lampada.modelo);
		lampada.ligar();
		
		lampada.mostrarEstado();
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
	}

}
