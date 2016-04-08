package lab11_12_13;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double C = scan.nextDouble();
		double F = (C*9/5)+32;
		System.out.println("A temperatura em Farenheit é: " + F + "F");

	}

}
