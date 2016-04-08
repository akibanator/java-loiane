package lab14_15;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		double media = (nota1+nota2)/2;
		
		if (media>=7 && media<10){
			System.out.println("O aluno foi aprovado");
		} else if (media<7){
			System.out.println("O aluno foi reprovado");
		} else if (media == 10){
			System.out.println("O aluno foi aprovado com distinção");
		}
		
		
	}

}
