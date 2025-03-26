package JavaPOO;

public class Principal {

	public static void main(String[] args) {
		
		Carro civic = new Carro();
		
		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.motor = 2.0;
		civic.placa = "EIC-2490";
		civic.cor = "Preta";
		civic.ano = 2024;
		civic.velocidade = 50;
		civic.exibirInfo();
		
		Carro corolla = new Carro();
		corolla.fabricante = "Toyota";
		corolla.modelo = "Corolla";
		corolla.motor = 2.0;
		corolla.placa = "EIC-2015";
		corolla.cor = "Preta";
		corolla.ano = 2024;
		corolla.velocidade = 50;
		corolla.exibirInfo();

	}

}
