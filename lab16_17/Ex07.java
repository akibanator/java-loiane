package lab16_17;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int maior = 0;
		int maiorNum = 0;
		
		for (int i = 0; i < 5; i++){
			System.out.println("Informe um número");
			num[i] = scan.nextInt();

			if (maiorNum < num[i]) {
				maiorNum = num[i];
			}
			
		}
		System.out.println("O maior número é " + maiorNum);

	}

}
