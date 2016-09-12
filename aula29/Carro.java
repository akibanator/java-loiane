package com.loiane.cursojava.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros; // número de passageiros
	double capCombustivel; // capacidade de combustível
	double consumoCombustivel;

	Carro() {
		System.out.println("Classe Carro foi instaciada");
		numPassageiros = 4;
	}

	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = capCombustivel_;
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}

	double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;
	}

}
