package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] tabuleiro = new String[3][3];

		boolean continuar = true;
		boolean verifica = true;
		int x = 0;
		int y = 0;

		System.out.println("Bem vindo ao jogo da velha");
		System.out.println("     1    2   3 ");
		System.out.println("");
		System.out.println("1      |    |   ");
		System.out.println("    ------------");
		System.out.println("2      |    |   ");
		System.out.println("    ------------");
		System.out.println("3      |    |   ");
		System.out.println("");

		System.out.println("O jogador 1 é X e o jogador 2 é O");

		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = "";
			}
		}

		do {
			do {
				System.out.println("Jogador 1, entre com a posição de X");
				System.out.println("De 1~3 entre com a posição linha");
				x = scan.nextInt();
				System.out.println("De 1~3 entre com a posição coluna");
				y = scan.nextInt();
				if ((x > 0) && (x <= 3) && (y > 0) && (y <= 3)) {
					x--;
					y--;
					if (tabuleiro[x][y] == "") {
						tabuleiro[x][y] = ("X");
						verifica = false;
					} else {
						System.out.println("O campo onde deseja já está ocupado");
					}
				} else {
					System.out.println("Valores inválidos, lembre-se o valor precisa ser de 1~3");
				}
			} while (verifica);

			System.out.println("");
			System.out.println("     1    2   3 ");
			System.out.println("");
			System.out.println(
					"1     " + tabuleiro[0][0] + " |  " + tabuleiro[0][1] + "  |	 " + tabuleiro[0][2] + "  ");
			System.out.println("     -------------");
			System.out.println(
					"2     " + tabuleiro[1][0] + " |  " + tabuleiro[1][1] + "  |	 " + tabuleiro[1][2] + "  ");
			System.out.println("     -------------");
			System.out.println(
					"3     " + tabuleiro[2][0] + " |  " + tabuleiro[2][1] + "  |	 " + tabuleiro[2][2] + "  ");
			System.out.println("");

			if (tabuleiro[0][0] == "X" && tabuleiro[0][1] == "X" && tabuleiro[0][2] == "X"
					|| tabuleiro[0][0] == "X" && tabuleiro[1][0] == "X" && tabuleiro[2][0] == "X"
					|| tabuleiro[1][0] == "X" && tabuleiro[1][1] == "X" && tabuleiro[1][2] == "X"
					|| tabuleiro[0][1] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][1] == "X"
					|| tabuleiro[0][2] == "X" && tabuleiro[1][2] == "X" && tabuleiro[2][2] == "X"
					|| tabuleiro[2][0] == "X" && tabuleiro[2][1] == "X" && tabuleiro[2][2] == "X"
					|| tabuleiro[0][0] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][2] == "X"
					|| tabuleiro[2][0] == "X" && tabuleiro[1][1] == "X" && tabuleiro[0][2] == "X") {
				System.out.println("O jogador 1 venceu");
				break;
			}

			verifica = true;

			do {
				System.out.println("Jogador 2, entre com a posição de O");
				System.out.println("De 1~3 entre com a posição linha");
				x = scan.nextInt();
				System.out.println("De 1~3 entre com a posição coluna");
				y = scan.nextInt();
				if ((x > 0) && (x <= 3) && (y > 0) && (y <= 3)) {
					x--;
					y--;
					if (tabuleiro[x][y] == "") {
						tabuleiro[x][y] = ("O");
						verifica = false;
					} else {
						System.out.println("O campo onde deseja já está ocupado");
					}
				} else {
					System.out.println("Valores inválidos, lembre-se o valor precisa ser de 1~3");
				}
			} while (verifica);

			System.out.println("");
			System.out.println("     1    2   3 ");
			System.out.println("");
			System.out.println(
					"1     " + tabuleiro[0][0] + " |  " + tabuleiro[0][1] + "  |	 " + tabuleiro[0][2] + "  ");
			System.out.println("     -------------");
			System.out.println(
					"2     " + tabuleiro[1][0] + " |  " + tabuleiro[1][1] + "  |	 " + tabuleiro[1][2] + "  ");
			System.out.println("     -------------");
			System.out.println(
					"3     " + tabuleiro[2][0] + " |  " + tabuleiro[2][1] + "  |	 " + tabuleiro[2][2] + "  ");
			System.out.println("");

			if (tabuleiro[0][0] == "O" && tabuleiro[0][1] == "O" && tabuleiro[0][2] == "O"
					|| tabuleiro[0][0] == "O" && tabuleiro[1][0] == "O" && tabuleiro[2][0] == "O"
					|| tabuleiro[1][0] == "O" && tabuleiro[1][1] == "O" && tabuleiro[1][2] == "O"
					|| tabuleiro[0][1] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][1] == "O"
					|| tabuleiro[0][2] == "O" && tabuleiro[1][2] == "O" && tabuleiro[2][2] == "O"
					|| tabuleiro[2][0] == "O" && tabuleiro[2][1] == "O" && tabuleiro[2][2] == "O"
					|| tabuleiro[0][0] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][2] == "O"
					|| tabuleiro[2][0] == "O" && tabuleiro[1][1] == "O" && tabuleiro[0][2] == "O") {
				System.out.println("O jogador 1 venceu");
				break;
			}

			verifica = true;

		} while (continuar);
	}

}
