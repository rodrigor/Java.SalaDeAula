package com.rodrigor.exemplos.controleestoque;
import javax.swing.JOptionPane;

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

public class ControleEstoque {

	
	public static void main(String[] args) {
		
		Produto p = new Produto();
		p.setNome("Sapato");
		p.setCodigo(123);
		p.setDescricao("Sapato preto");
		p.setEstoque(10);
		p.setPreco(200.0f);
		
		System.out.println(p);
		
		
		Pedido pedido = new Pedido();
		pedido.addProduto(p);
		pedido.addProduto(p,4);
		System.out.println("Total pedido:" + pedido.getTotalPedido());
		
		
		
//		while(true){
//			String  nome = JOptionPane.showInputDialog("Nome do Produto:");
//			
//			System.out.println("Nome digitado: "+ nome);
//			if(nome.equals("sair")){
//				break;
//			}
//		}
	}

}
