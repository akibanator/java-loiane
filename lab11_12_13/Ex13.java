package lab11_12_13;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double horaTrabalhada = scan.nextDouble();
		System.out.println("Quantas horas você trabalhou no mês? ");
		double horaMesTrabalhado = scan.nextDouble();
		double totalSalario = horaTrabalhada * horaMesTrabalhado;
		System.out.println("O salário bruto é: " + totalSalario);
		
		double descontoINSS = totalSalario * 0.08;
		System.out.println("Foi pago ao INSS: " + descontoINSS);
		
		double descontoSindicato = totalSalario * 0.05;
		System.out.println("Foi pago ao sindicato: " + descontoSindicato);
		
		double salarioLiquido = totalSalario - (descontoINSS+descontoSindicato);
		System.out.println("O salário liquido é: " + salarioLiquido);

		
	}

}
