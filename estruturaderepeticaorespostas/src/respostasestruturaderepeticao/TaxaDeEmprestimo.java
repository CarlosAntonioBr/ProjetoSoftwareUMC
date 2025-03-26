package respostasestruturaderepeticao;

import java.util.Scanner;

public class TaxaDeEmprestimo {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do empréstimo: R$ ");
        double valor = scanner.nextDouble();
        
        System.out.println("Escolha o número de parcelas:");
        System.out.println("6 meses (+5%)");
        System.out.println("12 meses (+10%)");
        System.out.println("24 meses (+20%)");
        int parcelas = scanner.nextInt();
        
        double total = valor;
        
        switch (parcelas) {
            case 6:
                total += valor * 0.05;
                break;
            case 12:
                total += valor * 0.10;
                break;
            case 24:
                total += valor * 0.20;
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }
        
        System.out.printf("O valor total a ser pago é: R$ %.2f\n", total);
        
        scanner.close();
    }


}


