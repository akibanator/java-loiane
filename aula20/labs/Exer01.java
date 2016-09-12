package com.loiane.cursojava.aula20.labs;

public class Exer01 {

	public static void main(String[] args) {
		
		int[][] matrizM = new int[4][4];
		
		for (int i=0; i<matrizM.length; i++){
			for(int j=0; j<matrizM[i].length; j++){
				matrizM[i][j] = (int) (Math.random() * 100);
			}
		}
		
		int maiorNumero = Integer.MIN_VALUE;
		int posMaiorI = 0;
		int	posMaiorJ = 0;
		
		for (int i=0; i<matrizM.length; i++){
			for(int j=0; j<matrizM[i].length; j++){
				if (matrizM[i][j]>maiorNumero){
					maiorNumero = matrizM[i][j];
					posMaiorI = i;
					posMaiorJ = j;
				}
			}
		}
		System.out.println("A maior número é " + maiorNumero + " cuja a localização é linha: " + posMaiorI +" coluna: " + posMaiorJ);

	}

}
