package lab14_15;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o salário: ");
		double salario = scan.nextDouble();
		double aumento = 0;
		double total = 0;
		
		if (salario<=280){
			System.out.println("O salário atual é: " + salario);
			System.out.println("O aumento será de: 20%");
			aumento = salario * 0.2;
			System.out.println("O valor a ser acrescentado será: " + aumento);
			total = salario + aumento;
			System.out.println("O novo salário será: " + total);
		} else if ((salario>280) && (salario<=700)){
			System.out.println("O salário atual é: " + salario);
			System.out.println("O aumento será de: 15%");
			aumento = salario * 0.15;
			System.out.println("O valor a ser acrescentado será: " + aumento);
			total = salario + aumento;
			System.out.println("O novo salário será: " + total);
		} else if ((salario>700) && (salario<=1500)){
			System.out.println("O salário atual é: " + salario);
			System.out.println("O aumento será de: 10%");
			aumento = salario * 0.1;
			System.out.println("O valor a ser acrescentado será: " + aumento);
			total = salario + aumento;
			System.out.println("O novo salário será: " + total);
		} else if (salario>1500){
			System.out.println("O salário atual é: " + salario);
			System.out.println("O aumento será de: 5%");
			aumento = salario * 0.05;
			System.out.println("O valor a ser acrescentado será: " + aumento);
			total = salario + aumento;
			System.out.println("O novo salário será: " + total);
		}
		
		
	}

}
