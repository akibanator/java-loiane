package lab16_17;

public class Ex24 {

	public static void main(String[] args) {
		
		double valorUnitario = 0.18;
		double preco = 0;

		for (int i = 1; i <= 50; i++){
			
			preco = valorUnitario * i;
			System.out.println("Para " + i + " unidades, o valor é de: " + preco);
		}
	}

}
