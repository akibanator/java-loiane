package com.loiane.cursojava.aula34.labs;

public class Calculadora {

	public static double somar(double n1, double n2) {
		return n1 + n2;
	}

	public static double subtrair(double n1, double n2) {
		return n1 - n2;
	}

	public static double multiplicar(double n1, double n2) {
		return n1 * n2;
	}

	public static double dividir(double n1, double n2) {
		return n1 / n2;
	}

	public static double potenciaN(double n1, double n2) {
		return Math.pow(n1, n2);
	}

	public static int fatorial(int n1) {
		int fatorial = 1;
		for (int i = 1; i <= n1; i++) {
			fatorial *= i;
		}
		return fatorial;
	}

}
