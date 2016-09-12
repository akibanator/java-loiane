package com.loiane.cursojava.aula33.lab;

public class Aluno {

	private String nomeAluno;
	private String matriculaAluno;
	private String cursoAluno;
	private String[] disciplinasAluno;
	private double[][] notasAluno;
	private double[] mediaAluno;

	public double[] getMediaAluno() {
		return mediaAluno;
	}

	public void setMediaAluno(double[] mediaAluno) {
		this.mediaAluno = mediaAluno;
	}

	public Aluno() {
		this.disciplinasAluno = new String[3];
		this.notasAluno = new double[3][4];
		this.mediaAluno = new double[3];
	}

	public Aluno(String nomeAluno, String matriculaAluno, String cursoAluno, String[] disciplinasAluno,
			double[][] notasAluno) {
		this.nomeAluno = nomeAluno;
		this.matriculaAluno = matriculaAluno;
		this.cursoAluno = cursoAluno;
		this.disciplinasAluno = disciplinasAluno;
		this.notasAluno = notasAluno;
		this.disciplinasAluno = new String[3];
		this.notasAluno = new double[3][4];
		this.mediaAluno = new double[3];
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getCursoAluno() {
		return cursoAluno;
	}

	public void setCursoAluno(String cursoAluno) {
		this.cursoAluno = cursoAluno;
	}

	public String[] getDisciplinasAluno() {
		return disciplinasAluno;
	}

	public void setDisciplinasAluno(String[] disciplinasAluno) {
		this.disciplinasAluno = disciplinasAluno;
	}

	public double[][] getNotasAluno() {
		return notasAluno;
	}

	public void setNotasAluno(double[][] notasAluno) {
		this.notasAluno = notasAluno;
	}

	public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
		this.disciplinasAluno[pos] = nomeDisciplina;
	}

	public void setNomePosIJ(int posI, int posJ, double nota) {
		this.notasAluno[posI][posJ] = nota;
	}

	public void verificarAprovado() {
		for (int i = 0; i < this.notasAluno.length; i++) {
			for (int j = 0; j < this.notasAluno[i].length; j++) {
				this.mediaAluno[i] += this.notasAluno[i][j];
			}
			System.out.println("A média do aluno em " + this.disciplinasAluno[i] + " foi " + (this.mediaAluno[i] / 4));
			if ((this.mediaAluno[i] / 4) <= 7) {
				System.out.println("O Aluno foi reprovado em " + this.disciplinasAluno[i]);
			} else {
				System.out.println("O Aluno foi aprovado em " + this.disciplinasAluno[i]);
			}
		}
	}

}
