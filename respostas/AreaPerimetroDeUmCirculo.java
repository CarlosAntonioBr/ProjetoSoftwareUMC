package respostas;

import java.util.Scanner;

public class AreaPerimetroDeUmCirculo {
	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Digite o raio do círculo: ");
	        double raio = sc.nextDouble();

	        double area = Math.PI * Math.pow(raio, 2);
	        double perimetro = 2 * Math.PI * raio;

	        System.out.println("Área do círculo: " + area);
	        System.out.println("Perímetro do círculo: " + perimetro);

	        sc.close();
}
}