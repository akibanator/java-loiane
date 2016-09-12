package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o nome da agenda: ");
		String nomeAgenda = scan.nextLine();

		Agenda agenda = new Agenda(nomeAgenda);

		System.out.println("Entre com as informações do contato: ");

		Contato[] contatos = new Contato[3];

		for (int i = 0; i < 3; i++) {
			Contato c = new Contato();

			System.out.println("Entre com o nome do contato");
			String nomeContato = scan.nextLine();
			c.setNome(nomeContato);

			System.out.println("Entre com o telefone do contato");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);

			System.out.println("Entre com o email do contato");
			String email = scan.nextLine();
			c.setEmail(email);

			contatos[i] = c;

		}

		agenda.setContatos(contatos);
		
		System.out.println(agenda.obterInfo());

	}

}
