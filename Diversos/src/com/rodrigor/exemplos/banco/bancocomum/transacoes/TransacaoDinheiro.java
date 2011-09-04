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
package com.rodrigor.exemplos.banco.bancocomum.transacoes;

/**
 * @author rodrigor
 * @since Apr 1, 2011
 * 
 */
public class TransacaoDinheiro extends TransacaoAbstrata {

	/**
	 * @param valor
	 */
	public TransacaoDinheiro(float valor) {
		this.setValor(valor);
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.exemplos.banco.bancocomum.transacoes.TransacaoAbstrata#getDescricao()
	 */
	@Override
	public String getDescricao() {
		return (this.getValor() > 0?"Deposito ":"Saque")+" no valor de "+this.getValor();
	}

}
