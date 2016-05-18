package lab14_15;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Escolha 'E' para etanol(R$1,90) e 'G' para gasolina(R$2,50)");
		String opcao = scan.nextLine();
		System.out.println("Quantos litros deseja abastecer?");
		double litros = scan.nextDouble();
		
		if (opcao.equals("E")){
			double valor = litros * 1.9;
				if ((litros<=20) && (litros>0)){
					double desconto = valor * 0.97;
					System.out.println("O valor será(desconto de 3%): " + desconto);
				} else if (litros>20){
					double desconto = valor * 0.95;
					System.out.println("O valor será(desconto de 5%): " + desconto);
				}
		} else if (opcao.equals("G")){
			double valor = litros * 2.5;
				if ((litros<=20) && (litros>0)){
					double desconto = valor * 0.96;
					System.out.println("O valor será(desconto de 4%): " + desconto);
				} else if (litros>20){
					double desconto = valor * 0.94;
					System.out.println("O valor será(desconto de 6%): " + desconto);
				}
		}
	}

}
