package respostasestruturaderepeticao;

import java.util.Scanner;

public class NumeroParOuImpar {

	public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        
	        int somaPares = 0, somaImpares = 0, numero;
	        
	        System.out.print("Digite um número (0 para sair): ");
	        numero = scanner.nextInt();
	        
	        while (numero != 0) {
	            if (numero % 2 == 0) {
	                somaPares += numero;
	                System.out.println(numero + " é PAR.");
	            } else {
	                somaImpares += numero;
	                System.out.println(numero + " é ÍMPAR.");
	            }
	            
	            System.out.print("Digite um número (0 para sair): ");
	            numero = scanner.nextInt();
	        }
	        
	        System.out.println("Soma dos números pares: " + somaPares);
	        System.out.println("Soma dos números ímpares: " + somaImpares);
	        
	        scanner.close();
	    }
	
}
