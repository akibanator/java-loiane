package com.loiane.cursojava.aula33.lab;

public class Exer02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.setNumeroConta("123456");
		conta.setSaldoConta(500);
		conta.setContaEspecial(true);
		conta.setSaldoEspecial(200);

		if (conta.realizarSaque(650)) {
			System.out.println("Saque realizado");
			conta.verificarSaldo();
		} else {
			System.out.println("Não foi possível realizar saque");
		}
		
		conta.depositar(100);
		conta.verificarSaldo();
		conta.verificarContaEspecial();

	}

}
