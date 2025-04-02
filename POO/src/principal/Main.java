package principal;

import java.util.Scanner;

import entidades.Livro;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Livro culpaDasEstrelas =new Livro();
		culpaDasEstrelas.livro ="A culpa é das estrelas";
		culpaDasEstrelas.autor = "John Green";
		culpaDasEstrelas.quantidade = 100;
		culpaDasEstrelas.valorUnit = 80;
		System.out.println("Informe a quantidade de livros emprestados: ");
		int quantidadeculpaDasEstrelas = sc.nextInt();
		culpaDasEstrelas.emprestimoLivro(quantidadeculpaDasEstrelas);	
		
		
		System.out.println(culpaDasEstrelas.exibeInfo());
		sc.close();
	}
	
	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}
	   
}
