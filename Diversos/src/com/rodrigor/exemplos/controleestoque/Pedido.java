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
public class Pedido {
	
	private final int TOTAL_ITENS = 10;
	private ItemPedido[] itens = new ItemPedido[TOTAL_ITENS];
	private int quantItens = 0;
	
	public void addProduto(Produto p){
		if(quantItens > TOTAL_ITENS){
			return;
		}
		itens[quantItens++] = new ItemPedido(p);
	}
	
	public void addProduto(Produto p, int quantidade){
		if(quantItens > TOTAL_ITENS){
			return;
		}
		itens[quantItens++] = new ItemPedido(p,quantidade);
	}
	
	
	
	public float getTotalPedido(){
		float soma = 0;
		for(int i = 0; i < quantItens; i++ ){
			soma += itens[i].getTotal();
		}
		return soma;
	}
	
}
