package lab14_15;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número positivo ou negativo: ");
		int num = scan.nextInt();
		
		if (num>=0){
			System.out.println("O número é positivo");
		} else if (num<0){
			System.out.println("O número é negativo");
		}
		
	}

}
