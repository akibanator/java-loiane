package lab14_15;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		double total = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem-vindo(a) ao Hipermercado Tabajara");
		System.out.println("Qual tipo de carne deseja?");
		System.out.println("Digite 'F' para File Duplo, 'A' para Alcatra, 'P' para Picanha");
		String tipoCarne = scan.nextLine();
		System.out.println("Quantos Kg de carne deseja comprar?");
		double kgCarne = scan.nextDouble();
		System.out.println("Possui cartão Tabajara: 'S' para sim | 'N' para não");
		String cartao = scan.next();
		
		if (tipoCarne.equals("F")){
			if ((kgCarne>0) && (kgCarne<=5)){
				total = kgCarne * 4.9;				
			} else if (kgCarne>5){
				total = kgCarne * 5.8;
			}
		} else if (tipoCarne.equals("A")){
			if ((kgCarne>0) && (kgCarne<=5)){
				total = kgCarne * 5.9;				
			} else if (kgCarne>5){
				total = kgCarne * 6.8;
			}
		} else if (tipoCarne.equals("P")){
			if ((kgCarne>0) && (kgCarne<=5)){
				total = kgCarne * 6.9;				
			} else if (kgCarne>5){
				total = kgCarne * 7.8;
			}
		} else {
			System.out.println("Valor inválido");
		}
		if (cartao.equalsIgnoreCase("S")){
			double desconto = total * 0.95;
			System.out.println("O valor é de: " + desconto);
		} else if (cartao.equalsIgnoreCase("N")){
			System.out.println("O valor é de: " + total);
		}
	}

}
