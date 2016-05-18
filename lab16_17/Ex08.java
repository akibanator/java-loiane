package lab16_17;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		int soma = 0;
		int i = 0;
		
		for (i = 0; i < 5; i++){
			System.out.println("Digite um número " + i + " :");
			num[i] = scan.nextInt();
			
			soma += num[i];
		}
		
		int media = soma/i;
		
		System.out.println("A média é " + media);
	}

}
