package lab16_17;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número base: ");
		int n1 = scan.nextInt();
		System.out.println("Digite um número expoente: ");
		int n2 = scan.nextInt();
		int n3 = n1;
		int potencia = 0;
		
		for (int i = 1;i < n2; i++){
			potencia = n1 * n3;
			n1 = potencia;
			System.out.println("O total é: " + potencia);
		}

	}

}
