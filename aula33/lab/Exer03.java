package com.loiane.cursojava.aula33.lab;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Digite o nome do aluno: ");
		aluno.setNomeAluno(scan.next());

		System.out.println("Digite a mátricula do aluno: ");
		aluno.setMatriculaAluno(scan.next());

		System.out.println("Digite o curso do aluno: ");
		aluno.setCursoAluno(scan.next());

		for (int i = 0; i < aluno.getDisciplinasAluno().length; i++) {
			System.out.println("Digite o nome da disciplina " + (i + 1));
			aluno.setNomeDisciplinaPos(i, scan.next());
		}

		for (int i = 0; i < aluno.getNotasAluno().length; i++) {
			System.out.println("Curso: " + aluno.getDisciplinasAluno()[i]);
			for (int j = 0; j < aluno.getNotasAluno()[i].length; j++) {
				System.out.println("Digite a nota " + (j+1));
				aluno.setNomePosIJ(i, j, scan.nextDouble());
				
			}
		}
		
		aluno.verificarAprovado();

	}

}
