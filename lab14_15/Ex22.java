package lab14_15;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem-Vindo(a) a fruteira");
		System.out.println("Deseja comprar quantos Kg de morango?");
		double morango = scan.nextDouble();
		System.out.println("Deseja comprar quantos Kg de maçã?");
		double maca = scan.nextDouble();
		
		double pesoTotal = morango + maca;
		
		if ((pesoTotal>0) && (pesoTotal<=5)) {
			double valorMorango = morango * 2.5;
			double valorMaca = maca * 1.8;
			
			double valorTotal = valorMorango + valorMaca;
			System.out.println("O valor total (1):" + valorTotal);
		} else if (pesoTotal>5) {
			double valorMorango = morango * 2.2;
			double valorMaca = maca * 1.5;
			
			double valorTotal = valorMorango + valorMaca;
			System.out.println("O valor total (2):" + valorTotal);
		}

	}

}
