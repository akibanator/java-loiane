package lab16_17;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean repeat = false;
		
		while (!repeat) {
			System.out.println("Digite uma nota entre 0 - 10: ");
			int nota = scan.nextInt();
			if ((nota>=0) && (nota<=10)){
				repeat = true;
				System.out.println("Nota válida");
			} else{
				System.out.println("Nota inválida digite novamente");
			}
		}
		


	}

}
