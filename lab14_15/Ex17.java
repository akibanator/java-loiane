package lab14_15;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o ano desejado para saber se é bissexto: ");
		int ano = scan.nextInt();
		int anob = ano%4;
		if (anob==0){
			System.out.println("O ano " + ano + " é bissexto");
		} else {
			System.out.println("O ano " + ano + " não é bissexto");
		}
	}

}
