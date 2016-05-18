package lab16_17;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = scan.nextInt();
		
		if ((n1 <= 10) && (n1 >= 0)){
			System.out.println("A tabuada de " + n1);
			for (int i = 0; i <= 10; i++){
				int total = 0;
				total = n1 * i;
				System.out.println(n1 + " X " + i + " = " + total);
			}
		} else {
			System.out.println("Número inválido");
		}
		

	}

}
