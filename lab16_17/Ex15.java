package lab16_17;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número ");
		int n = scan.nextInt();
		int soma1 = 1;
		int soma2 = 1;
		int total = 1;
		
		System.out.print(soma1 + ", ");
		
		for (int i = 0; i < n; i++){
			System.out.print(soma2 + ", ");
			total = soma1 + soma2;
			soma1 = soma2;
			soma2 = total;
		}

	}

}
