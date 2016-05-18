package lab16_17;

public class Ex16 {

	public static void main(String[] args) {
		
		boolean passou = false;
		int soma1 = 1;
		int soma2 = 0;
		int soma3 = 0;
		
		while (!passou){
			soma3 = soma1 + soma2;
			soma1 = soma2;
			soma2 = soma3;
			System.out.print(soma1 + ", ");
			
			if ((soma1 > 500) || (soma2 > 500) || (soma3 > 500)){
				System.out.println(soma3);
				passou = true;
			}
		}

	}

}
