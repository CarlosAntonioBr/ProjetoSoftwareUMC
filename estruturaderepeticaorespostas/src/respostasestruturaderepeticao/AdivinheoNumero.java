package respostasestruturaderepeticao;

import java.util.Random;
import java.util.Scanner;

public class AdivinheoNumero {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(10) + 1;
        
        System.out.print("Tente adivinhar o número (entre 1 e 10): ");
        int palpite = scanner.nextInt();
        
        if (palpite == numeroAleatorio) {
            System.out.println("Parabéns! Você acertou.");
        } else {
            System.out.println("Errado! O número era " + numeroAleatorio);
        }
        
        scanner.close();
    }



	}


