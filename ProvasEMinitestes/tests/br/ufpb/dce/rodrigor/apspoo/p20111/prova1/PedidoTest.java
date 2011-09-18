package br.ufpb.dce.rodrigor.apspoo.p20111.prova1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import br.ufpb.dce.rodrigor.apspoo.p20111.prova1.q1.ErroPedidoException;
import br.ufpb.dce.rodrigor.apspoo.p20111.prova1.q1.Pedido;
import br.ufpb.dce.rodrigor.apspoo.p20111.prova1.q1.Produto;

public class PedidoTest {

	@Test
	public void testPedido() {
		Pedido pedido = new Pedido();
		assertEquals(new Float(0.0f),pedido.getTotalPedido());
		Produto prod = new Produto();
		prod.setPreco(10.0f);
		try{
			pedido.addProduto(prod);
			fail("Pedido n‹o deve aceitar um produto sem c—digo");
		}catch(ErroPedidoException e){
			assertEquals("O c—digo do produto n‹o foi definido",e.getMessage());
		}
		prod.setCodigo(123);
		pedido.addProduto(prod);
		assertEquals(new Float(10.0),pedido.getTotalPedido());
		pedido.addProduto(prod);
		assertEquals(new Float(20.0),pedido.getTotalPedido());
	}

}
