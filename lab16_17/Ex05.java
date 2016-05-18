package lab16_17;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a população do país A");
		double paisA = scan.nextDouble();
		System.out.println("Entre com a população do país B");
		double paisB = scan.nextDouble();
		System.out.println("Entre com a taxa de crescimento do país A");
		double taxaAnoA = scan.nextDouble();
		System.out.println("Entre com a taxa de crescimento do país B");
		double taxaAnoB = scan.nextDouble();
		
		boolean passou = false;
		int i = 0;
				
		do {	
			double popA = paisA * taxaAnoA;
			double popB = paisB * taxaAnoB;
			
			paisA = paisA + popA;
			paisB = paisB + popB;
			
			i++;
			
			if (paisA>paisB){
				passou = true;
				System.out.println("Vai levar " + i + " anos para o páis A passar ou igualar o B em população.");
				System.out.println("População A: " + paisA);
				System.out.println("População B: " + paisB);
			}
			
		} while (!passou);

	}

}
