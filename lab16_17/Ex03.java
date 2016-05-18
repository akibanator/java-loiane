package lab16_17;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean nomeValido = false;
		boolean idadeValido = false;
		boolean salarioValido = false;
		boolean sexoValido = false;
		boolean estadocivilValido = false;
		
		while (!nomeValido){
			System.out.println("Digite o seu nome: ");
			String nome = scan.nextLine();
			
			if (nome.length() > 3) {
				nomeValido = true;
				System.out.println("Nome válido");
			} else {
				System.out.println("Nome inválido, digite um nome com pelo menos 4 caracteres");
			}
		}
		
		while (!idadeValido){
			System.out.println("Digite sua idade: ");
			int idade = scan.nextInt();
			
			if (idade >= 0 && idade <= 150){
				idadeValido = true;
				System.out.println("Idade válida");
			} else {
				System.out.println("Idade inválida, digite uma idade entre 0 à 150");				
			}
		}
		
		while (!salarioValido){
			System.out.println("Digite o seu sálario: ");
			double salario = scan.nextDouble();
			
			if (salario > 0) {
				salarioValido = true;
				System.out.println("Salário válido");
			} else {
				System.out.println("Salário inválido, digite um salário maior que zero");
			}
		}
		
		while (!sexoValido){
			System.out.println("Digite o seu gênero: ");
			String sexo = scan.next();
			
			if ((sexo.equalsIgnoreCase("f")) || (sexo.equalsIgnoreCase("m"))){
				sexoValido = true;
				System.out.println("Gênero válido");
			} else {
				System.out.println("Gênero inválido, digite um gênero com M de Masculino ou F de Feminino");
			}
		}
		
		while (!estadocivilValido){
			System.out.println("Digite seu estado civil: ");
			String estadocivil = scan.next();
			
			if (estadocivil.equalsIgnoreCase("s") || estadocivil.equalsIgnoreCase("c") || estadocivil.equalsIgnoreCase("v") || estadocivil.equalsIgnoreCase("d")){
				estadocivilValido = true;
				System.out.println("Estado civil válido");
			} else {
				System.out.println("Estado civil inválido, digite um gênero com S de solteiro(a) ou C de Casado(a) ou V de Viuvo(a) ou D de Divorciado(a)");
			}
		}

	}

}
