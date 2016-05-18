package lab16_17;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int n1 = scan.nextInt();
		System.out.println("Entre com outro número: ");
		int n2 = scan.nextInt();
	    int intervalo = 0;
	    int total = 0;
		
		if (n1 < n2){
			intervalo = n2 - n1;
		} else if (n1 > n2){
			intervalo = n1 - n2;
		}
		
		if (intervalo < 0){
			intervalo += 1;
		} else if (intervalo > 0){
			intervalo -= 1;
		}
		
		n1++;
		
		for (int i = 0; i < intervalo; i++){
			System.out.println(n1);
			total += n1;
			n1 ++;
		}
		
		System.out.println("A soma dos números inteiro no intervalo é: " + total);
	}

}
