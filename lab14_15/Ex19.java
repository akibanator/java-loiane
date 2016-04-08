package lab14_15;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe dois números");
		System.out.println("Informe o primeiro número: ");
		double n1 = scan.nextDouble();
		System.out.println("Informe o segundo número: ");
		double n2 = scan.nextDouble();
		
		System.out.println("Informe qual operação deseja realizar");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		int opcao = scan.nextInt();
		double resultado = 0;

		switch(opcao){
		case 1: resultado = n1 + n2; break;
		case 2: resultado = n1 - n2; break; 
		case 3: resultado = n1 * n2; break; 
		case 4: resultado = n1 / n2; break;
		default: System.out.println("Valor inválido");
		}
		
		System.out.println("O resultado da operação é: " + resultado);
		
		double par = resultado % 2;
		if (par==0){
			System.out.println("O resultado é par");
		} else {
			System.out.println("O resultado é ímpar");
		}
		
		if (resultado>=0) {
			System.out.println("O resultado é positivo");
		} else {
			System.out.println("O resultado é negativo");
		}
	}

}
