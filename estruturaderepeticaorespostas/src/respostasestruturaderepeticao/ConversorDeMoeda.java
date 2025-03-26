package respostasestruturaderepeticao;

import java.util.Scanner;

public class ConversorDeMoeda {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor em reais (R$): ");
        double reais = scanner.nextDouble();
        
        System.out.println("Escolha a moeda para conversão:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");
        int escolha = scanner.nextInt();
        
        double convertido = 0;
        String moeda = "";
        
        switch (escolha) {
            case 1:
                convertido = reais * 0.20;
                moeda = "US$";
                break;
            case 2:
                convertido = reais * 0.18;
                moeda = "€";
                break;
            case 3:
                convertido = reais * 0.15;
                moeda = "£";
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }
        
        System.out.printf("Valor convertido: %s %.2f\n", moeda, convertido);
        
        scanner.close();
    }

}


