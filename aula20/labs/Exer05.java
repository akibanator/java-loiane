package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean continuar = true;
		
		String[][][] agendaM = new String[12][31][25];
		
		do{
			
			System.out.println("'1' para cadastrar, '2' para consultar e '3' para sair");
			int op = scan.nextInt();
			int cont = 0;
			
			if(op==1){			
				System.out.println("Digite o mês");
				int mes = scan.nextInt();
				System.out.println("Digite o dia");
				int dia = scan.nextInt();
				System.out.println("Digite a hora");
				int hora = scan.nextInt();
				mes--;
				dia--;
				
				for (int i=mes; i<mes; i++){
					for (int j=dia; j<dia ; j++){
						for (int k=0; k<agendaM[i][j].length; k++){
							if (agendaM[i][j][k] != null){
								cont++;
							}
						}
					}
				}
				
				if (cont>8){
					System.out.print("O limite de registros diários não podem ultrapassar 8");
					break;
				}
					
					System.out.println("Entre com compromisso");
					agendaM[mes][dia][hora] = scan.next();
					
					System.out.println("No mês " + (mes+1) + " do dia " + (dia+1) + " na hora " + hora + " foi registrado o compromisso " + agendaM[mes][dia][hora]);
			} else if(op==2){
				System.out.println("Digite o mês");
				int mes = scan.nextInt();
				System.out.println("Digite o dia");
				int dia = scan.nextInt();
				System.out.println("Digite a hora");
				int hora = scan.nextInt();
				mes--;
				dia--;
				
				System.out.println("No mês " + (mes+1) + " do dia " + (dia+1) + " na hora " + hora + " foi registrado o compromisso " + agendaM[mes][dia][hora]);
			} else if(op==3){
				System.out.println("Saindo...");
				continuar = false;
			} else if (op==4) {
				for (int i=0; i<agendaM.length; i++){
					for (int j=0; j<agendaM[i].length ; j++){
						for (int k=0; k<agendaM[i][j].length; k++){
							if (agendaM[i][j][k] != null){
								System.out.println("No mês " + (i+1) + " do dia " + (j+1) + " na hora " + k + " foi registrado o compromisso " + agendaM[i][j][k]);
							}
						}
					}
				}
			}
			
			
			
		}while(continuar);

	}

}
