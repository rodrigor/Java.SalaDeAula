package com.rodrigor.exemplos.controleestoque;
/**
 * Autor: Rodrigo Rebouças de Almeida
 * http://www.rodrigor.com
 * (cc)Creative Commons 2010
 *
 * Este trabalho está licenciado sob uma Licença 
 * Creative Commons Atribuição-Uso Não-Comercial-Compartilhamento 
 * pela mesma Licença 2.5 Brasil. 
 * Para ver uma cópia desta licença, visite 
 * http://creativecommons.org/licenses/by-nc-sa/2.5/br/ 
 * ou envie uma carta para Creative Commons, 
 * 171 Second Street, Suite 300, 
 * San Francisco, California 94105, USA.
 */

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class ItemPedido {

	private Produto produto;
	private int quantidade;
	
	
	public ItemPedido(Produto p, int quantidade){
		this.produto = p;
		this.quantidade = quantidade;
	}
	
	public ItemPedido(Produto p){
		this.produto = p;
		quantidade = 1;
	}
	
	
	/**
	 * @return the produto
	 */
	public Produto getProduto() {
		return produto;
	}
	/**
	 * @param produto the produto to set
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}
	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public float getTotal(){
		return produto.getPreco() * this.quantidade;
	}
	
	
	
}
