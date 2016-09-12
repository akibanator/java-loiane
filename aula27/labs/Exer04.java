package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		JogoDaVelha jogo = new JogoDaVelha();

		jogo.tabuleiro = new String[3][3];

		jogo.decidirJogador();

		jogo.exibirTabuleiroComeco();

		do {

			jogo.realizarJogada();

			jogo.exibirTabuleiro();

			jogo.verificarVencedor();

			jogo.verificarEmpate();

		} while (jogo.verificarVencedor() && jogo.verificarEmpate());

	}

}
