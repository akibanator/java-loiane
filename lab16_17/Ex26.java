package lab16_17;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		int num = scan.nextInt();
		int total = 1;
		
		for (int i = num; i >= 1; i--) {
			total *= i;
		}
		
		System.out.println("O fatorial de " + num + " é");
		
		System.out.print(num + "! = ");
		for (int i = num; i > 0; i--) {
			if (i == 1) {
				System.out.print(i + " = ");
			} else {
				System.out.print(i + " . ");
			}
		}
		
		System.out.println(total);

	}

}
