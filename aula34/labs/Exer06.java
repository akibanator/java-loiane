package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com valor de n1");
		int num1 = scan.nextInt();

		System.out.println("Minutos para Segundos: " + ConversaoDeUnidadesDeTempo.minutosParaSegundos(num1));
		System.out.println("Horas para Minutos: " + ConversaoDeUnidadesDeTempo.horasParaMinutos(num1));
		System.out.println("Dias para Horas: " + ConversaoDeUnidadesDeTempo.diasParaHoras(num1));
		System.out.println("Semanas para Dias: " + ConversaoDeUnidadesDeTempo.semanasParaDias(num1));
		System.out.println("Meses para Dias: " + ConversaoDeUnidadesDeTempo.mesParaDias(num1));
		System.out.println("Anos para Dias: " + ConversaoDeUnidadesDeTempo.anosParaDias(num1));

	}

}
