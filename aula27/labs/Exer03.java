package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = scan.next();
		
		System.out.println("Digite o número da matrícula do aluno: ");
		aluno.matricula = scan.nextInt();
		
		System.out.println("Digite o nome do curso do aluno: ");
		aluno.nomeCurso = scan.next();
		
		aluno.nomesDisciplina = new String[3];
		
		for (int i=0; i<aluno.nomesDisciplina.length; i++){
			System.out.println("Digite o nome da disciplina " + (i+1));
			aluno.nomesDisciplina[i] = scan.next();
		}
		
		aluno.notasDisciplina = new double[3][4];
		
		for (int i=0; i<aluno.nomesDisciplina.length; i++){
			System.out.println("Digite as notas da disciplina " + aluno.nomesDisciplina[i]);
			for (int j=0; j<aluno.notasDisciplina[i].length; j++){
				System.out.println("Nota " + (j+1));
				aluno.notasDisciplina[i][j] = scan.nextDouble();
			}
		}
		
		aluno.exibirDadosAluno();
		
		for (int i=0; i<aluno.notasDisciplina.length; i++){
			if (aluno.verificarAprovado(i)){
				System.out.println("Aprovado");
			} else {
				System.out.println("Não aprovado");
			}
		}

	}

}
