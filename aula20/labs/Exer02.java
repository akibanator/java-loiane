package com.loiane.cursojava.aula20.labs;

public class Exer02 {

	public static void main(String[] args) {
		
		int[][] matrizM = new int[10][10];
		
		for (int i=0; i<matrizM.length; i++){
			for (int j=0; j<matrizM[i].length; j++){
				matrizM[i][j] = (int) (Math.random() * 10);
			}
		}
		
		for (int i=0; i<matrizM.length; i++){
			for (int j=0; j<matrizM[i].length; j++){
				System.out.print(matrizM[i][j] + " ");
			}
			System.out.println();
		}
		
		int maiorNum5 = Integer.MIN_VALUE;
		int menorNum5 = Integer.MAX_VALUE;
		
		for (int j=0; j<matrizM[5].length; j++){
			if (maiorNum5<matrizM[5][j]){
				maiorNum5 = matrizM[5][j];
			} else if (menorNum5>matrizM[5][j]){
				menorNum5 = matrizM[5][j];
			}
		}
		
		System.out.println("O maior número da linha 5 é " + maiorNum5 + " e o menor número é " + menorNum5);
		
		int maiorNum7 = Integer.MIN_VALUE;
		int menorNum7 = Integer.MAX_VALUE;
		
		for (int i=0; i<matrizM.length; i++){
			if (maiorNum7<matrizM[i][7]){
				maiorNum7 = matrizM[i][7];
			} else if (menorNum7>matrizM[i][7]){
				menorNum7 = matrizM[i][7];
			}
		}

		System.out.println("O maior número da coluna 7 é " + maiorNum7 + " e o menor número é " + menorNum7);

	}

}
