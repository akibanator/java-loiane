package lab14_15;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em qual turno você estuda? M - Matutino | V - Vespertino | N - Noturno");
		String turno = scan.nextLine();
		
		if (turno.equals("M")){
			System.out.print("Bom dia!");
		} else if (turno.equals("V")){
			System.out.println("Boa tarde!");
		} else if (turno.equals("N")){
			System.out.print("Boa noite!");
		} else {
			System.out.println("Valor inválido");
		}
		
	}

}
