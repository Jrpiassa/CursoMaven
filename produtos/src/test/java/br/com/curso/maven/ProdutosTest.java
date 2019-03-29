package br.com.curso.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutosTest {
	@Test
	public void verificaImposto() {
		Produtos bala = new Produtos("juquinha", 0.10);
        assertEquals(0.11, bala.getPrecoComImposto(), 0.00001);
	}
}
