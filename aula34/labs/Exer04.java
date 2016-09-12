package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor de n1");
		double num1 = scan.nextDouble();

		System.out.println("Metros para Pés " + ConversaoDeUnidadesDeArea.metrosParaPes(num1));
		System.out.println("Pés para Centímetros " + ConversaoDeUnidadesDeArea.pesParaCentimetros(num1));
		System.out.println("Milhas para Acres " + ConversaoDeUnidadesDeArea.milhaParaAcres(num1));
		System.out.println("Acres para Pés " + ConversaoDeUnidadesDeArea.acresParaPes(num1));

	}

}
