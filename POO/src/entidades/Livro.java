package entidades;

public class Livro {
	//Atributos
	public String livro;
	public String autor;
	public int quantidade;
	public double valorUnit;
	//Métodos
	public String exibeInfo() {
		return "Livro: " + livro +
				"\nAutor: " + autor +
				"\nQuantidade: " + quantidade +
				"\nValor Unitário: " + valorUnit +
				"\nValor total: " + valorTotal();
	}
	
	public void emprestimoLivro(int quantidade) {
		this.quantidade = quantidade;
	}

	public double valorTotal() {
		double valorTotalLivros = quantidade * valorUnit;
		return valorTotalLivros;
	}
}
