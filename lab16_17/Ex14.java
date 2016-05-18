package lab16_17;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] num = new int[10];
		int par = 0;
		int impar = 0;
		
		for (int i = 0;i < 10 ;i++ ){
			System.out.println("Digite um número: ");
			num[i] = scan.nextInt();
			if (num[i]%2==0){
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Números pares: " + par);
		System.out.println("Números ímpares: " + impar);
	}

}
