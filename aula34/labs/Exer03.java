package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com valor de n1");
		int num1 = scan.nextInt();

		System.out.println("Fatorial: " + Calculadora.fatorial(num1));

	}
}
