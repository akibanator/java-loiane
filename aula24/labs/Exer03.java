package com.loiane.cursojava.aula24.labs;

public class Exer03 {

	public static void main(String[] args) {
		
		LivroDeLivraria livro = new LivroDeLivraria();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.preco = 63.39;
		
		System.out.println("Nome do livro = " + livro.nome);

	}

}
