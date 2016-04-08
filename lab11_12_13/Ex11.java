package lab11_12_13;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite outro número inteiro: ");
		int numero2 = scan.nextInt();
		System.out.println("Agora, digite um número real: ");
		double numero3 = scan.nextDouble();
		double resultado1 = (2*numero1) * (numero2/2);
		double resultado2 = (3*numero1) + numero3;
		double resultado3 = numero3*numero3*numero3;
		System.out.println("Resultado A: " + resultado1);
		System.out.println("Resultado B: " + resultado2);
		System.out.println("Resultado C: " + resultado3);
				
	}

}
