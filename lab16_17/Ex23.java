package lab16_17;

public class Ex23 {

	public static void main(String[] args) {
		
		double valorUnitario = 1.99;
		double preco = 0;

		for (int i = 1; i <= 50; i++){
			
			preco = valorUnitario * i;
			System.out.println("Para " + i + " unidades, o valor é de: " + preco);
		}
	}

}
