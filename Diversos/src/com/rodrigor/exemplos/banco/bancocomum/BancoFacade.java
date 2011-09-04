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
package com.rodrigor.exemplos.banco.bancocomum;

import com.rodrigor.exemplos.banco.bancocomum.transacoes.TransacaoDinheiro;

/**
 * @author rodrigor
 * @since Apr 5, 2011
 * 
 */
public class BancoFacade {
	
	
	private Banco banco;

	/**
	 * @param numeroBanco
	 * @param nome
	 */
	public BancoFacade(int numeroBanco, String nome) {
		this.banco = new Banco(numeroBanco, nome);
	}
	
	
	public void depositarDinheiro(float valor, String cc, String ag) throws Exception{
		TransacaoDinheiro t = new TransacaoDinheiro(valor);
		banco.getAgencia(ag).getConta(cc).novaTransacao(t);
	}
	
	

}
