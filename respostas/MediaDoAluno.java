package respostas;

import java.util.Scanner;

public class MediaDoAluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Digite sua primeira nota: ");
		float nota2 = sc.nextFloat();
		
		System.out.println("Digite sua primeira nota: ");
		float nota3 = sc.nextFloat();
		
		System.out.println("Média é: " + (nota1 + nota2 + nota3)/3);
		
		sc.close();

	}

}
