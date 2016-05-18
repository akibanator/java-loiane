package lab14_15;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor que você ganha por hora trabalhada: ");
		double valorHora = scan.nextDouble();
		System.out.println("Digite a quantidade de horas que você trabalhou no mês: ");
		double qtdHoras = scan.nextDouble();
		double percentualIR = 0;
		double salarioBruto = valorHora * qtdHoras;
		
		if (salarioBruto <= 900) {
			System.out.println("Isento de IR");
			percentualIR = 0;
		} else if ((salarioBruto > 900) && (salarioBruto <= 1500)) {
			System.out.println("Desconto de 5% de IR");
			percentualIR = 5;
		} else if ((salarioBruto > 1500) && (salarioBruto <= 2500)) {
			System.out.println("Desconto de 10% de IR");
			percentualIR = 10;
		} else if (salarioBruto > 2500) {
			System.out.println("Desconto de 20% de IR");
			percentualIR = 20;
		}
		
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		System.out.println("Salário bruto é : (" + valorHora + " x " + qtdHoras + ") = " + salarioBruto);
		System.out.println("(-) IR (" + ir + ")");
		System.out.println("(-) INSS (" + inss + ")");
		System.out.println("FGTS (" + fgts + ")");
		System.out.println("Total de descontos: " + totalDescontos);
		double salarioLiquido = salarioBruto - totalDescontos;
		System.out.println("Salário liquido : " + salarioLiquido);
	}
}
