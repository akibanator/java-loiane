package com.loiane.cursojava.aula43.labs.exer01v2;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		String s = "ContaEspecial [limite=" + limite + "]";
		s += super.toString();
		return s;
	}

	public boolean sacar(double valor) {
		double saldoComLimite = getSaldo() + limite;
		if (saldoComLimite >= valor) {
			this.setSaldo(getSaldo() - valor);
			return true;
		}
		return false;
	}
}
