package lab16_17;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean acabou = false;
		int jovem = 0;
		int adulto = 0;
		int idoso = 0;
		
		do {
			System.out.println("Qual a idade da pessoa?");
			int idade = scan.nextInt();
			
			System.out.println("Quer continuar?");
			String continuar = scan.next();
			if ((continuar.equalsIgnoreCase("N")) || (continuar.equalsIgnoreCase("NAO"))){
				acabou = true;
			}
			
			if ((idade >= 0) && (idade <= 25)){
				jovem ++;
			} else if ((idade > 25) && (idade <= 60)){
				adulto ++;
			} else if (idade > 60) {
				idoso ++;
			}
		} while (!acabou);
		
		if ((jovem >= adulto) && (jovem >= idoso)){
			System.out.println("A turma é jovem");
		} else if ((adulto >= jovem) && (adulto >= idoso)){
			System.out.println("A turma é adulta");
		} else if ((idoso >= jovem) && (idoso >= adulto)){
			System.out.println("A turma é idosa");
		}
		
	}

}
