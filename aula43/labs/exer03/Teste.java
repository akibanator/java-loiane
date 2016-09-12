package com.loiane.cursojava.aula43.labs.exer03;

public class Teste {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.setNome("Camelo");
		animal.setComprimento(150);
		animal.setNumPatas(4);
		animal.setCor("Amarelo");
		animal.setAmbiente("Terra");
		animal.setVelocidade(2.0);
		
		System.out.println(animal);
		System.out.println();
		
		Peixe peixe = new Peixe();
		peixe.setNome("Tubarão");
		peixe.setComprimento(300);
		peixe.setVelocidade(1.5);
		peixe.setCaracteristicas("Barbatanas e cauda");
		
		System.out.println(peixe);
		System.out.println();
		
		Mamifero mamifero = new Mamifero();
		mamifero.setNome("Urso-do-canadá");
		mamifero.setComprimento(180);
		mamifero.setNumPatas(4);
		mamifero.setCor("Vermelho");
		mamifero.setVelocidade(0.5);
		mamifero.setAlimento("Mel");
		
		System.out.println(mamifero);

	}

}
