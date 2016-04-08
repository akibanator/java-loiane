package lab14_15;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro e informarei se é par ou impar: ");
		int numero = scan.nextInt();
		
		int par = numero%2;
		
		if (par==0) {
			System.out.println("O número informado é par");
		} else {
			System.out.println("O número informado é impar");
		}
	}

}
