package com.loiane.cursojava.aula33.lab;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		JogoDaVelha jogo = new JogoDaVelha();

		jogo.decidirQuemComeca();

		while (jogo.determinarVencedor()) {
			if (jogo.determinarJogador()) {
				System.out.println("Jogador X é a sua vez");
				System.out.println("Entre com a linha em que deseja ");
				int linha = scan.nextInt();
				System.out.println("Entre com a coluna em que deseja ");
				int coluna = scan.nextInt();
				jogo.realizarJogada(linha, coluna, 'X');
			} else {
				System.out.println("Jogador O é a sua vez");
				System.out.println("Entre com a linha em que deseja ");
				int linha = scan.nextInt();
				System.out.println("Entre com a coluna em que deseja ");
				int coluna = scan.nextInt();
				jogo.realizarJogada(linha, coluna, 'O');
			}
			jogo.exibirTabuleiro();
		}

	}

}
