package com.loiane.cursojava.aula27;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros; //número de passageiros
	double capCombustivel; //capacidade de combustível
	double consumoCombustivel;

	void exibirAutonomia(){		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km){
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
	
}
