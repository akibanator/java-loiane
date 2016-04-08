package lab14_15;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe os lados do triângulo");
		System.out.println("Informe o primeiro lado: ");
		double lado1 = scan.nextDouble();
		System.out.println("Informe o segundo lado: ");
		double lado2 = scan.nextDouble();
		System.out.println("Informe o terceiro lado: ");
		double lado3 = scan.nextDouble();
		if ((lado1+lado2>lado3) || (lado1+lado3>lado2) || (lado2+lado3>lado1)){
			System.out.println("É um triângulo");
			if ((lado1==lado2) && (lado1==lado3)) {
				System.out.println("O triângulo é equilátero");
			} else if ((lado1==lado2) && (lado1!=lado3)){
				System.out.println("O triângulo é isósceles");
			} else if ((lado1==lado3) && (lado1!=lado2)){
				System.out.println("O triângulo é isósceles");
			} else if ((lado2==lado3) && (lado2!=lado1)){
				System.out.println("O triângulo é isósceles");
			} else if ((lado1!=lado2) && (lado1!=lado3)){
				System.out.println("O triângulo é escanelo");
			}
		} else {
			System.out.println("Não é um triângulo");
		}
	}

}
