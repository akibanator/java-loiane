package com.loiane.cursojava.aula40;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;
	
	

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Aluno(String nome, String endereco, String telefone, String cpf, String telefoneCelular) {
		super(nome, endereco, telefone, cpf, telefoneCelular);
		// TODO Auto-generated constructor stub
	}



	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer(){
		super.setCpf("23123213123");
		
		this.setCpf("1231231231");
	}
	
	public String obterEtiquetaEndereco(){
		
		String s = "Endereço do Aluno: ";
		s += super.getEndereco();
		
		return s;
	}

}
