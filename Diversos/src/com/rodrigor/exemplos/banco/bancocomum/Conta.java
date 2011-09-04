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

import java.util.LinkedList;
import java.util.List;

import com.rodrigor.exemplos.banco.bancocomum.transacoes.TransacaoDinheiro;

/**
 * @author rodrigor
 * @since Apr 1, 2011
 * 
 */
public class Conta {
	
	private String numero;
	private List<Transacao> transacoes;
	
	public Conta(String numero){
		this.numero = numero;
		transacoes = new LinkedList<Transacao>();
	}
	
	public float getSaldo(){
		float saldo = 0.0f;
		for(Transacao t: transacoes){
			saldo += t.getValor();
		}
		return saldo;
	}
	
	public float sacar(float valor) throws Exception{
		if(valor < 0)
			throw new Exception("Valor inválido! Valor deve ser positivo");
		if((getSaldo() - valor) < 0)
			throw new Exception("Saldo insuficiente!");
		TransacaoDinheiro t = new TransacaoDinheiro(-valor);
		this.novaTransacao(t);
		return valor;
	}
	

	/**
	 * @param t
	 */
	public void novaTransacao(Transacao t) {
		this.transacoes.add(t);
		
	}

}
