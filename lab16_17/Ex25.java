package lab16_17;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double total = 0;
			
		for (int i = 1;; i++){
			System.out.println("Digite o valor do produto " + i + ": ");
			double valorProduto = scan.nextDouble();
			total += valorProduto;
			
			if (valorProduto == 0){
				System.out.println("Total: " + total);
				i = 0;
				total = 0;
				System.out.println("Próxima compra");
			} 
		}
	}

}
