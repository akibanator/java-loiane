package com.loiane.cursojava.aula46.labs.exer01;

public class Teste {

	public static void main(String[] args) {

		Circulo circulo = new Circulo();
		circulo.setNome("Circulo");
		circulo.setCor("Azul");
		circulo.setRaio(2);

		Triangulo triangulo = new Triangulo();
		triangulo.setNome("Triangulo");
		triangulo.setCor("Vermelho");
		triangulo.setBase(3);
		triangulo.setAltura(2);

		Quadrado quadrado = new Quadrado();
		quadrado.setNome("Quadrado");
		quadrado.setCor("Violeta");
		quadrado.setLado(2);

		Cubo cubo = new Cubo();
		cubo.setNome("Cubo");
		cubo.setCor("Preto");
		cubo.setAresta(3);

		Cilindro cilindro = new Cilindro();
		cilindro.setNome("Cilindro");
		cilindro.setCor("Rosa");
		cilindro.setAltura(3);
		cilindro.setRaio(2);

		Piramide piramide = new Piramide();
		piramide.setNome("Piramide");
		piramide.setCor("Verde");
		piramide.setAltura(3);
		piramide.setApotema(4);
		piramide.setArestaBase(2);
		piramide.setNumPoliBase(4);
		piramide.setBase(quadrado);

		FiguraGeometrica[] figurageometricas = new FiguraGeometrica[6];
		figurageometricas[0] = circulo;
		figurageometricas[1] = triangulo;
		figurageometricas[2] = quadrado;
		figurageometricas[3] = cubo;
		figurageometricas[4] = cilindro;
		figurageometricas[5] = piramide;

		for (FiguraGeometrica f : figurageometricas) {
			System.out.println("------------------------");
			System.out.println(f.getNome());
			System.out.println(f.getCor());
			if (f instanceof Figura2D) {
				Figura2D f2d = (Figura2D) f;
				System.out.println(f2d.calcularArea());
			}
			if (f instanceof Figura3D) {
				Figura3D f3d = (Figura3D) f;
				System.out.println(f3d.calcularArea());
				System.out.println(f3d.calcularVolume());
			}
		}

	}

}
