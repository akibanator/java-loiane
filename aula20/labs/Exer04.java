package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] agendaM = new String[31][25];

		boolean continuar = true;

		do {

			System.out.println("'1' para cadastrar, '2' para consultar, '3' para listar todos e '4' para sair");
			int op = scan.nextInt();

			if (op == 1) {
				System.out.println("Qual dia do mês você deseja cadastrar?");
				int dia = scan.nextInt();
				System.out.println("Qual o horário desse dia?");
				int hora = scan.nextInt();
				System.out.println("Digite a tarefa");
				agendaM[dia][hora] = scan.next();
			} else if (op == 2) {
				System.out.println("Qual dia do mês você deseja consultar?");
				int dia = scan.nextInt();
				System.out.println("Qual o horário desse dia?");
				int hora = scan.nextInt();
				System.out.println("No dia " + dia + " na hora " + hora + " está marcado " + agendaM[dia][hora]);
			} else if (op == 3) {
				for (int i = 0; i < agendaM.length; i++) {
					for (int j = 0; j < agendaM[i].length; j++) {
						if (agendaM[i][j] != null) {
							System.out.println("No mês " + (i + 1) + " do dia " + (j + 1)
									+ " foi registrado o compromisso " + agendaM[i][j]);
						}
					}
				}
			} else if (op == 4) {
				System.out.println("Saindo");
				continuar = false;
			}

		} while (continuar);

	}

}
