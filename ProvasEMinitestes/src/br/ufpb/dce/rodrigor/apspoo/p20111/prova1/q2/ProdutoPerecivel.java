package br.ufpb.dce.rodrigor.apspoo.p20111.prova1.q2;

import br.ufpb.dce.rodrigor.apspoo.p20111.prova1.q1.Produto;

public class ProdutoPerecivel extends Produto {

	public ProdutoPerecivel(String nome, int codigo, float preco) {
		super(nome, codigo, preco);
	}

	private String vencimento;
	
	public void setVencimento(String v){
		this.vencimento = v;
	}
}
