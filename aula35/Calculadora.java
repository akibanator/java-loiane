package com.loiane.cursojava.aula35;

public class Calculadora {
	
	public static int fatorialNaoRecursivo(int n1) {
		int fatorial = 1;
		for (int i = 1; i <= n1; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
	
	public static int fatorialRecursivo(int n1){
		
		if (n1 == 0) {
			return 1;
		}
		
		return n1 * fatorialRecursivo(n1-1);
	}

}
