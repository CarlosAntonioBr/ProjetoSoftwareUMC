package respostas;

import java.util.Scanner;

public class ConversaoDeTemperatura {
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celcius: ");
		double celcius = sc.nextDouble();
		System.out.println("A temperatura em F é: " + celcius*9/5+32 );
		System.out.println("A temperatura em K é: " + celcius+273.15 );
		
		sc.close();

}
}