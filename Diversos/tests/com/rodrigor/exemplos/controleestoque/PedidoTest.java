package com.rodrigor.exemplos.controleestoque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class PedidoTest {

	@Test
	public void testPedido() {
		Pedido pedido = new Pedido();
		assertEquals(new Float(0.0f),pedido.getTotalPedido());
		Produto prod = new Produto();
		prod.setPreco(10.0f);
		try{
			pedido.addProduto(prod);
			fail("Pedido não deve aceitar um produto sem código");
		}catch(ErroPedidoException e){
			assertEquals("O código do produto não foi definido",e.getMessage());
		}
		prod.setCodigo(123);
		pedido.addProduto(prod);
		assertEquals(new Float(10.0),pedido.getTotalPedido());
		pedido.addProduto(prod);
		assertEquals(new Float(20.0),pedido.getTotalPedido());
	}

}
