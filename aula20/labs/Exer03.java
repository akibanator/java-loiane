package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] matrizM = new int[3][3];
		
		for (int i=0; i<matrizM.length; i++){
			for (int j=0; j<matrizM[i].length; j++){
				System.out.println("Entre com um valor para (linha " + (i+1) + ") e (coluna " + (j+1) +").");
				matrizM[i][j] = scan.nextInt();
			}
		}
		
		int contPar = 0;
		int contImpar = 0;
		
		for (int i=0; i<matrizM.length; i++){
			for (int j=0; j<matrizM[i].length; j++){

				if (matrizM[i][j] % 2 == 0){
					contPar++;
				} else {
					contImpar++;
				}
				
			}
		}
		
		System.out.println("A quantidade de números pares é: " + contPar + " e ímpares é: " + contImpar);

	}

}
