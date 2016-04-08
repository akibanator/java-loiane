package lab11_12_13;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o raio do circulo: ");
		double raio = scan.nextDouble();
		double areaCirculo = Math.PI*(raio*raio);
		System.out.println("A area do círculo é: " + areaCirculo);

	}

}
