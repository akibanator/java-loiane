package com.loiane.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros; //número de passageiros
	double capCombustivel; //capacidade de combustível
	double consumoCombustivel;

	void exibirAutonomia(){		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	
}
