package lab16_17;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		int fatorial = num;
		int total = num;
		
		for (int i = 1; i < num; i++){
			fatorial--;
			total = total * fatorial;
		}
		System.out.println("Fatorial é: " + total);
	}

}
