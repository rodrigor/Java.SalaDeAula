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

import java.util.Date;

import com.rodrigor.exemplos.banco.bancocomum.Transacao;

/**
 * @author rodrigor
 * @since Apr 1, 2011
 * 
 */
public abstract class TransacaoAbstrata implements Transacao {

	private String id;
	private Date data;
	private float valor;
	
	public TransacaoAbstrata(){
		this.data = new Date();
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(float valor) {
		this.valor = valor;
	}

	/**
	 * @return the valor
	 */
	public float getValor() {
		return valor;
	}

	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}
	
	public abstract String getDescricao();
	
	
	
}
