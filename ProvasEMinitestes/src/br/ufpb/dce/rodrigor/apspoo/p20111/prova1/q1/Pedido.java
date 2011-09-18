package br.ufpb.dce.rodrigor.apspoo.p20111.prova1.q1;

import java.util.LinkedList;
import java.util.List;

import br.ufpb.dce.rodrigor.apspoo.p20111.prova1.q2.ProdutoNaoPerecivel;


public class Pedido {
	
	private List<ItemPedido> itens;
	
	public Pedido(){
		this.itens = new LinkedList<ItemPedido>();
	}

	public Float getTotalPedido() {
		float total = 0.0f;
		for(ItemPedido item: itens){
			total += item.getTotal();
		}
		return total;
	}

	public void addProduto(Produto prod){
		addProduto(prod,1);
	}

	/*
	 * MŽtodo p/ quest‹o 2
	 */
	public void addProduto(Produto prod, int i) {
		if(prod.getCodigo() == 0)
			throw new ErroPedidoException("O c—digo do produto n‹o foi definido");
		itens.add(new ItemPedido(prod,i));
		
	}

}
