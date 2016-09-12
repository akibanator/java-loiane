package com.loiane.cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		// van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.numPassageiros);

		Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2);

		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiros);
		System.out.println(van.capCombustivel);
		System.out.println(van.consumoCombustivel);


	}

}
