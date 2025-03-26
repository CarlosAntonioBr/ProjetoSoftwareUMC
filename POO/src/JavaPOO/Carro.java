package JavaPOO;

public class Carro {
	//Atributos
	public String fabricante;
	public String modelo;
	int ano;
	public String placa;
	public String cor;
	int velocidade;
	double motor;
	int freio;
	
	public void exibirInfo() {
		System.out.println(
				"\nfabricante: " + fabricante +
				"\nModelo: " + modelo +
				"\nCor: " + cor +
				"\nano: " + ano +
				"\nPlaca: " + placa +
				"\nMotor: " + motor +
				"\nVelocidade: " + velocidade
				);
	}
	public void acelera(int vel){
		velocidade = velocidade +vel;	
	}

}
