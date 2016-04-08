package lab11_12_13;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo em MB: ");
		double tamanhoArq = scan.nextDouble();
		System.out.println("Informe a largura da banda em Mbps: ");
		double velBandaLarga = scan.nextDouble();
		double converterMbps = velBandaLarga/8;
		double tempoAproximado = (tamanhoArq / converterMbps)/60;
		System.out.println("O tempo aproximado de download é: " + tempoAproximado);
		
	}

}
