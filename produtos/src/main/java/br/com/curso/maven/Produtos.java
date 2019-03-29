package br.com.curso.maven;

public class Produtos {
	private final String nome;
	private final double preco;

	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public double getPrecoComImposto() {
        return preco * 1.1;
    }

}
