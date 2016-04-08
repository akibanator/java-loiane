package lab11_12_13;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit: ");
		double F = scan.nextDouble();
		double C = (5 * (F-32) / 9);
		System.out.println("A temperatura em Celsius é: " + C + "Cº");
		
	}

}
