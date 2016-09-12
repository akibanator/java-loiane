package com.loiane.cursojava.aula43.labs.exer01v2;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		String s = "ContaPoupanca [diaRendimento=" + diaRendimento + "]";
		s += " " + super.toString();
		return s;
	}

	public boolean calcularNovoSaldo(double valorDiaRendimento) {

		Calendar hoje = Calendar.getInstance();

		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldo(getSaldo() + (getSaldo() * diaRendimento));
			return true;
		}
		return false;
	}

}
