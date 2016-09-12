package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o nome do curso");
		String nomeCurso = scan.nextLine();

		System.out.println("Entre com o horário do curso");
		String horarioCurso = scan.nextLine();

		System.out.println("Entre com as informações do professor");
		System.out.println("Entre com o nome do professor");
		String nomeProfessor = scan.nextLine();

		System.out.println("Entre com o departamento do professor");
		String departamentoProfessor = scan.nextLine();

		System.out.println("Entre com o e-mail do professor");
		String emailProfessor = scan.nextLine();

		Curso curso = new Curso();
		curso.setNome(nomeCurso);
		curso.setHorario(horarioCurso);
		
		Professor professor = new Professor();
		professor.setNome(nomeProfessor);
		professor.setDepartamento(departamentoProfessor);
		professor.setEmail(emailProfessor);
		
		curso.setProfessor(professor);

		System.out.println("Entre com as informações dos alunos");
		Aluno[] alunos = new Aluno[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("Entre com o nome do aluno " + (i + 1));
			String nomeAluno = scan.next();

			System.out.println("Entre com a matricula do aluno " + (i + 1));
			String matriculaAluno = scan.next();
			
			double[] notas = new double[4];

			System.out.println("Entre com as notas do aluno");
			for (int j = 0; j < 4; j++) {
				System.out.println("Entre com a nota " + (j + 1));
				notas[j] = scan.nextDouble();
			}

			Aluno aluno = new Aluno();
			
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matriculaAluno);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
		}

		curso.setAlunos(alunos);

		System.out.println(curso.obterInfo());

	}

}
