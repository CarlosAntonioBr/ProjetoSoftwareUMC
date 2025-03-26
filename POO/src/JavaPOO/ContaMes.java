package JavaPOO;

public class ContaMes {

	public static void main(String[] args) {
        	
		ContaMes janeiro = new ContaMes();
		ContaMes fevereiro = new ContaMes();
		
		janeiro.agua = 1000;
		janeiro.luz = 100;
		janeiro.alimentacao = 100;
		
		fevereiro.agua = 1000;
		fevereiro.luz = 100;
		fevereiro.alimentacao = 100;
		
		double gastoJan = janeiro.somaGasto();
		double gastoFev = fevereiro.somaGasto();
		
		if(gastoJan > gastoFev) {
			System.out.println("O gasto de janeiro foi maior");
		}
		else if(gastoFev > gastoJan) {
			
			System.out.println("O gasto de fevereiro foi maior");
		}
		else {
			System.out.println("O gasto foi o mesmo");
		}

	}

}
