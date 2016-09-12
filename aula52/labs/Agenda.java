package com.loiane.cursojava.aula52.labs;

public class Agenda {

	private Contato[] contatos;

	public Agenda() {
		contatos = new Contato[5];
	}

	public void adicionarContato(Contato c) throws AgendaCheiaException {

		boolean cheia = true;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		if (cheia) {
			// lan�ar exception aqui
			throw new AgendaCheiaException();
		}

	}

	public int consultaContatoPorNome(String nome) throws ContatoNaoExisteException {

		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				if (contatos[i].getNome().equalsIgnoreCase(nome)) {
					return i;
				}
			}
		}
		// lan�ar exception contato n�o existe
		throw new ContatoNaoExisteException(nome);
	}

	@Override
	public String toString() {
		String s = "";
		for (Contato c : contatos) {
			if (c != null) {
				s += c.toString() + "\n";
			}
		}
		return s;
	}

}
