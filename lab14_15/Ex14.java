package lab14_15;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double medf = (nota1+nota2)/2;
		
		if ((medf<=10) && (medf>=9)){
			System.out.println("Nota A");
			System.out.println("Aprovado");
		} else if((medf<9) && (medf>=7.5)) {
			System.out.println("Nota B");
			System.out.println("Aprovado");
		} else if ((medf<7.5) && (medf>=6)){
			System.out.println("Nota C");
			System.out.println("Aprovado");
		} else if ((medf<6) && (medf>=4)){
			System.out.println("Nota D");
			System.out.println("Reprovado");
		} else if ((medf<4) && (medf>=0)){
			System.out.println("Nota E");
			System.out.println("Reprovado");
		} else {
			System.out.println("Valor inválido");
		}
	}

}
