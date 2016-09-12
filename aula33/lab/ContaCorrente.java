package com.loiane.cursojava.aula33.lab;

public class ContaCorrente {

	private String numeroConta;
	private double saldoConta;
	private boolean contaEspecial;
	private double saldoEspecial;

	public ContaCorrente() {
	}

	public ContaCorrente(String numeroConta, double saldoConta, boolean contaEspecial, double saldoEspecial) {
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
		this.contaEspecial = contaEspecial;
		this.saldoEspecial = saldoEspecial;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public boolean isContaEspecial() {
		return contaEspecial;
	}

	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}

	public double getSaldoEspecial() {
		return saldoEspecial;
	}

	public void setSaldoEspecial(double saldoEspecial) {
		this.saldoEspecial = saldoEspecial;
	}

	public boolean realizarSaque(double valorSaque) {
		if (saldoConta >= valorSaque) {
			saldoConta -= valorSaque;
			return true;
		} else {
			if (contaEspecial) {
				double limite = saldoConta + saldoEspecial;
				if (limite >= valorSaque) {
					saldoConta -= valorSaque;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	public void depositar(double valorDeposito) {
		saldoConta += valorDeposito;
		System.out.println("Depósito efetuado");
	}

	public void verificarSaldo() {
		System.out.println("Saldo: " + saldoConta);
	}

	public void verificarContaEspecial() {
		if (saldoConta < 0) {
			System.out.println("Está usando limite especial");
		}
	}
}
