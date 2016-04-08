package lab14_15;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os valores de uma equação de 2ºgrau");
		System.out.println("ax²+bx+c");
		System.out.println("Digite o valor de 'a': ");
		double a = scan.nextDouble();
		System.out.println("Digite o valor de 'b': ");
		double b = scan.nextDouble();
		System.out.println("Digite o valor de 'c': ");
		double c = scan.nextDouble();
		
		if (a!=0){
			double delta = (b*b) - 4*a*c;
			double x1 = (-(b)+Math.sqrt(delta))/2*a;
			double x2 = (-(b)-Math.sqrt(delta))/2*a;
			
			if (delta<0){
				System.out.println("A equação não possui raízes reais");
			} else if (delta==0) {
				System.out.println("A equação possui apenas uma raiz real");
				System.out.println("Raiz 1: " + x1);
				System.out.println("Raiz 2: " + x2);
			} else if (delta>0){
				System.out.println("A equação possui duas raízes reais");
				System.out.println("Raiz 1: " + x1);
				System.out.println("Raiz 2: " + x2);
			}
		} else {
			System.out.println("Não é uma equação de 2ºgrau");
		}
	}

}
