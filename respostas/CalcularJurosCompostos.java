package respostas;

import java.util.Scanner;

public class CalcularJurosCompostos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o seu caital: ");
		double C = sc.nextDouble();
		
		System.out.println("Insira o seu taxa: ");
		double I = sc.nextDouble();
		
		System.out.println("Insira o seu tempo: ");
		double T = sc.nextDouble();
		
		System.out.println("Seu MMC é: " + C*(T+I));
		
		sc.close();

	}

}
