package respostas;

import java.util.Scanner;

public class CalcularJurosSimples {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.println("Qual o capital inicial: ");
		        float C = sc.nextFloat();

		        System.out.println("Qual a taxa de juros mensal (%): ");
		        float I = sc.nextFloat();

		        System.out.println("Qual o tempo em meses: ");
		        float T = sc.nextFloat();

		        I /= 100;

	
		        float J = C * I * T;

		        float montante = C + J;

		        System.out.println("Juros acumulados: R$ " + J);
		        System.out.println("Montante total: R$ " + montante);

		        sc.close();
		    }

}