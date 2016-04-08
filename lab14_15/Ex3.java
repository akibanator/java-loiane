package lab14_15;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o sexo 'F' - Feminino ou 'M' - Masculino");
		String sexo = scan.nextLine();
		
		/*switch(sexo){
		case "M": System.out.println("Masculino"); break;
		case "F": System.out.println("Feminino"); break;
		default: System.out.println("Não é um sexo válido"); break;
		}*/
		
		//Quando for comparar String utilizar equals
		//Quando for comparar um campo em branco utilize isEmpty
		
		if (sexo.equals("M")){
			System.out.println("Masculino");
		} else if (sexo.equals("F")){
			System.out.println("Feminino");
		} else {
			System.out.println("Não é um sexo válido");
		}
	}

}
