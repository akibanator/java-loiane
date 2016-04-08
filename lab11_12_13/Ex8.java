package lab11_12_13;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora?: ");
		double horasTrabalhadas = scan.nextDouble();
		System.out.println("Qual o total de horas trabalhadas durante o mês?: ");
		double totalHoras = scan.nextDouble();
		double resultado = totalHoras * horasTrabalhadas;
		System.out.println("O seu salário nesse mês foi: " + resultado);

	}

}
