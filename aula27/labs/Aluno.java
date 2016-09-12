package com.loiane.cursojava.aula27.labs;

public class Aluno {

	String nome;
	int matricula;
	String nomeCurso;
	String[] nomesDisciplina;
	double[][] notasDisciplina;

	void exibirDadosAluno() {
		System.out.println("Nome do aluno: " + nome);

		System.out.println("Matrícula: " + matricula);

		System.out.println("Nome do Curso: " + nomeCurso);

		for (int i = 0; i < nomesDisciplina.length; i++) {
			System.out.println("Discplina " + (i + 1) + ": " + nomesDisciplina[i]);
			for (int j = 0; j < notasDisciplina[i].length; j++) {
				System.out.println("Nota " + (j + 1) + ": " + notasDisciplina[i][j]);
			}
		}
	}

	boolean verificarAprovado(int indice) {
		double media = 0;
		double total = 0;
		for (int i = 0; i < notasDisciplina[indice].length; i++) {
			media += notasDisciplina[indice][i];
		}
		total = media / 4;

		if (total >= 7) {
			return true;
		}
		return false;
	}

}
