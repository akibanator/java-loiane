package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor de n1");
		double num1 = scan.nextDouble();
		
		System.out.println("Litros para Centimetros Cub: " + ConversaoDeUnidadesDeVolume.litrosParaCentimetros(num1));
		System.out.println("Metros cub para Litros: " + ConversaoDeUnidadesDeVolume.metrosParaLitros(num1));
		System.out.println("Metros para Pés cub: " + ConversaoDeUnidadesDeVolume.metrosParaPes(num1));
		System.out.println("Galão Americano para Polegadas Cub: " + ConversaoDeUnidadesDeVolume.galaoAmericanoParaPolegadas(num1));
		System.out.println("Galão Americano para Litros: " + ConversaoDeUnidadesDeVolume.galaoAmericanoParaLitros(num1));

	}
}
