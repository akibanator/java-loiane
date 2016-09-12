package com.loiane.cursojava.aula27.labs;

import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {

	String[][] tabuleiro;
	int jogador;
	int x;
	int y;
	boolean continuar = true;

	Scanner scan = new Scanner(System.in);

	Random random = new Random();

	int decidirJogador() {
		System.out.println("Decidindo qual jogador começará");
		jogador = random.nextInt(2);
		System.out.println("O jogador " + (jogador + 1) + " fará a primeira jogada");
		return jogador;
	}

	void exibirTabuleiroComeco() {
		System.out.println("Exibindo tabuleiro");
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = " ";
			}
			System.out.println();
		}
	}

	void exibirTabuleiro() {
		System.out.println("Exibindo tabuleiro");
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + " ");
			}
			System.out.println();
		}
	}

	void realizarJogada() {
		if (jogador % 2 == 0) {
			do {
				System.out.println("Jogador 1 fará sua jogada");
				System.out.println("Insira a posição desejada");
				System.out.println("Digite a posição da linha");
				x = scan.nextInt();
				x--;
				System.out.println("Digite a posição da coluna");
				y = scan.nextInt();
				y--;
				if (tabuleiro[x][y] == " ") {
					tabuleiro[x][y] = "X";
					continuar = false;
				} else {
					System.out.println("Posição ocupada");
				}
			} while (continuar);
		} else {
			do {
				System.out.println("Jogador 2 fará sua jogada");
				System.out.println("Insira a posição desejada");
				System.out.println("Digite a posição da linha");
				x = scan.nextInt();
				x--;
				System.out.println("Digite a posição da coluna");
				y = scan.nextInt();
				y--;
				if (tabuleiro[x][y] == " ") {
					tabuleiro[x][y] = "O";
					continuar = false;
				} else {
					System.out.println("Posição ocupada");
				}
			} while (continuar);
		}
		jogador++;
		continuar = true;
	}

	boolean verificarVencedor() {
		if (tabuleiro[0][0] == "X" && tabuleiro[0][1] == "X" && tabuleiro[0][2] == "X"
				|| tabuleiro[1][0] == "X" && tabuleiro[1][1] == "X" && tabuleiro[1][2] == "X"
				|| tabuleiro[2][0] == "X" && tabuleiro[2][1] == "X" && tabuleiro[2][2] == "X"
				|| tabuleiro[0][0] == "X" && tabuleiro[1][0] == "X" && tabuleiro[2][0] == "X"
				|| tabuleiro[0][1] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][1] == "X"
				|| tabuleiro[0][2] == "X" && tabuleiro[1][2] == "X" && tabuleiro[2][2] == "X"
				|| tabuleiro[0][0] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][2] == "X"
				|| tabuleiro[0][2] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][0] == "X") {

			System.out.println("O jogador 1 venceu");

			return false;
		} else if (tabuleiro[0][0] == "O" && tabuleiro[0][1] == "O" && tabuleiro[0][2] == "O"
				|| tabuleiro[1][0] == "O" && tabuleiro[1][1] == "O" && tabuleiro[1][2] == "O"
				|| tabuleiro[2][0] == "O" && tabuleiro[2][1] == "O" && tabuleiro[2][2] == "O"
				|| tabuleiro[0][0] == "O" && tabuleiro[1][0] == "O" && tabuleiro[2][0] == "O"
				|| tabuleiro[0][1] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][1] == "O"
				|| tabuleiro[0][2] == "O" && tabuleiro[1][2] == "O" && tabuleiro[2][2] == "O"
				|| tabuleiro[0][0] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][2] == "O"
				|| tabuleiro[0][2] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][0] == "O") {

			System.out.println("O jogador 2 venceu");

			return false;
		}
		return true;

	}

	boolean verificarEmpate() {
		if (jogador == 9) {
			System.out.println("Empate");
			return false;
		}
		return true;

	}

}
