package br.ufpb.dce.rodrigor.apspoo.p20111.prova1.q1;

public class ItemPedido {
	
	private Produto produto;
	private int quantidade;
	
	public ItemPedido(Produto p, int quant){
		this.produto = p;
		this.quantidade = quant;
	}

	public float getTotal() {
		return produto.getPreco() * this.quantidade;
	}

}
