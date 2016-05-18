package lab16_17;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean LoginValido = false;
		
		while (!LoginValido) {
			System.out.println("Digite um usuário: ");
			String usuario = scan.nextLine();
			System.out.println("Digite uma senha: ");
			String senha = scan.nextLine();
			
			if (usuario.equalsIgnoreCase(senha)) {
				System.out.println("O usuário não pode ser igual a senha, digite novamente");
			} else {
				LoginValido = true;
				System.out.println("Usuário válido");
			}
		}
		
	}

}
