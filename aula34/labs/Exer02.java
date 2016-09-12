package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com valor de n1");
		double num1 = scan.nextDouble();
		System.out.println("Entre com valor de n2");
		double num2 = scan.nextDouble();
		
		System.out.println("Somar: " + Calculadora.somar(num1, num2));
		System.out.println("Subtrair: " + Calculadora.subtrair(num1, num2));
		System.out.println("Multiplicar: " + Calculadora.multiplicar(num1, num2));
		System.out.println("Dividir: " + Calculadora.dividir(num1, num2));
		System.out.println("Potência base(n1), expoente(n2): " + Calculadora.potenciaN(num1, num2));
		
	}

}
