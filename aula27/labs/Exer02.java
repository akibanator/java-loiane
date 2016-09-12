package com.loiane.cursojava.aula27.labs;

public class Exer02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;

		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

		boolean saqueEfetuado = conta.realizarSaque(10);

		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultaSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insulficiente");
		}

		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultaSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insulficiente");
		}

		System.out.println("Depósito de 500 reais");
		conta.depositar(500);
		conta.consultaSaldo();

		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
		
		conta.realizarSaque(600);
		conta.consultaSaldo();
		
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}

	}

}
