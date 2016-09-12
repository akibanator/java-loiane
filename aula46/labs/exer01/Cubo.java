package com.loiane.cursojava.aula46.labs.exer01;

public class Cubo extends Figura3D {

	private double aresta;

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	@Override
	public double calcularArea() {
		return 6 * (aresta * aresta);
	}

	@Override
	public double calcularVolume() {
		return aresta * aresta * aresta;
		// Math.pow(lado, 3);
	}

}
