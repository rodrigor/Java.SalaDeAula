package br.ufpb.dce.rodrigor.apspoo.p20111.prova1.q2;

import br.ufpb.dce.rodrigor.apspoo.p20111.prova1.q1.Pedido;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProdutoPerecivel fruta = new Fruta("Banana Prata",123,1.0f);
		fruta.setVencimento("23/10/2011");
		ProdutoPerecivel carne = new Carne("Picanha",312,30.0f);
		carne.setVencimento("15/11/2011");
		ProdutoNaoPerecivel panela = new Panela("Panela Inox",234,100.0f);
		Pedido pedido = new Pedido();
		pedido.addProduto(fruta);
		pedido.addProduto(carne);
		pedido.addProduto(panela,2);
		System.out.println(pedido.getTotalPedido());

	}

}
