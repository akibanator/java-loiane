package lab14_15;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor que você ganha por hora trabalhada: ");
		double horaTrabalhada = scan.nextDouble();
		System.out.println("Digite a quantidade de horas que você trabalhou no mês: ");
		double horasTrabalhadasMes = scan.nextDouble();
		double salarioLiquido = 0;
		double IR = 0;
		double INSS = 0;
		double FGTS = 0;
		double descontos = 0;
		double salarioBruto = horaTrabalhada * horasTrabalhadasMes;
		
		if (salarioBruto<=900){
			System.out.println("Salário bruto: " + salarioBruto);
			System.out.println("Imposto de renda: isento");
			INSS = salarioBruto * 0.1;
			System.out.println("INSS: " + INSS);
			FGTS = salarioBruto * 0.11;
			System.out.println("FGTS: " + FGTS);
			descontos = INSS + FGTS;
			System.out.println("Total de descontos: " + descontos);
			salarioLiquido = salarioBruto - descontos;
			System.out.println("Salário líquido: " + salarioLiquido);
		} else if ((salarioBruto>900) && (salarioBruto<=1500)){
			System.out.println("Salário bruto: " + salarioBruto);
			System.out.println("Imposto de renda: " + IR);
			INSS = salarioBruto * 0.1;
			System.out.println("INSS: " + INSS);
			FGTS = salarioBruto * 0.11;
			System.out.println("FGTS: " + FGTS);
			descontos = INSS + FGTS;
			System.out.println("Total de descontos: " + descontos);
			salarioLiquido = salarioBruto - descontos;
			System.out.println("Salário líquido: " + salarioLiquido);
		}
	}

}
