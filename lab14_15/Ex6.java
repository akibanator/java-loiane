package lab14_15;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		System.out.println("Digite o terceiro número: ");
		double num3 = scan.nextDouble();
		
		if ((num1>=num2) && (num1>=num3)){
			System.out.println("O número: " + num1 + " é o maior número");
		} else if ((num2>=num1) && (num2>=num3)){
			System.out.println("O número: " + num2 + " é o maior número");
		} else if ((num3>=num1) && (num3>=num2)){
			System.out.println("O número: " + num3 + " é o maior número");
		}
		
	}

}
