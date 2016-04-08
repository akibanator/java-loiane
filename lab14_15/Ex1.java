package lab14_15;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número 1: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o número 2: ");
		int num2 = scan.nextInt();
		
		if (num1>num2){
			System.out.println("O maior número é: " + num1);
		} else if (num2>num1){
			System.out.println("O maior número é: " + num2);
		}

	}

}
