package lab16_17;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num = scan.nextInt();

		int cont = 0;
		
		for (int i = 1; i <= num; i++){
			
			if (num % i == 0){
				cont ++;
			}
			
		}
		
		if (cont == 2){
			System.out.println(num + " é um número primo.");
		}

	}

}
