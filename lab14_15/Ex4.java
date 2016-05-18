package lab14_15;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		String letra = scan.nextLine();
		
		if (letra.length() > 1){
			System.out.println("Digite só uma letra");
		} else {
		switch(letra){
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U": System.out.println("A letra é vogal"); break;
		default: System.out.println("A letra é consoante"); break;
		}
		}
	}

}
