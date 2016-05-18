package lab16_17;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe quantos CDs você possui");
		int CD = scan.nextInt();
		double[] valor = new double[CD];
		double total = 0;
		double media = 0;
		
		for (int i = 0; i < CD; i++){
			System.out.println("Informe o preço do CD " + i);
			valor[i] = scan.nextDouble();
			total += valor[i];
		}
		media = total / CD;
		System.out.println("O valor médio gasto por CD: " + media);
		System.out.println("O valor total gasto é: " + total);
	}

}
