package com.loiane.cursojava.aula33.lab;

import java.util.Random;

public class JogoDaVelha {

	Random random = new Random();

	private int jogador;
	private char[][] tabuleiro;

	public JogoDaVelha() {
		this.jogador = 0;
		this.tabuleiro = new char[3][3];
	}

	public JogoDaVelha(int jogador, char[][] tabuleiro) {
		this.jogador = 0;
		this.tabuleiro = new char[3][3];
	}

	public void decidirQuemComeca() {
		this.jogador = random.nextInt(2);
	}

	public boolean determinarJogador() {
		if (jogador % 2 == 0) {
			jogador++;
			return true;
		}
		jogador++;
		return false;
	}

	public void exibirTabuleiro() {
		for (int i = 0; i < this.tabuleiro.length; i++) {
			for (int j = 0; j < this.tabuleiro[i].length; j++) {
				System.out.print(this.tabuleiro[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void realizarJogada(int lin, int col, char sinal) {
		this.tabuleiro[lin][col] = sinal;
	}

	public boolean determinarVencedor() {
		if (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O' ||
				tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O' ||
				tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O' ||
				tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O' ||
				tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O' ||
				tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O' ||
				tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O' ||
				tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O') {
			System.out.println("Jogador O venceu");
			return false;
		} else {
			if (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X' ||
					tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X' ||
					tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X' ||
					tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X' ||
					tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X' ||
					tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X' ||
					tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X' ||
					tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X') {
				System.out.println("Jogador X venceu");
				return false;
			}
		}
		return true;
	}

}
