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

import java.util.HashMap;
import java.util.Map;

/**
 * @author rodrigor
 * @since Apr 1, 2011
 * 
 */
public class Agencia {
	
	private String num;
	
	private Map<String,Conta> contas;

	/**
	 * @param num
	 */
	public Agencia(String num) {
		this.num = num;
		contas = new HashMap<String,Conta>();
	}

	/**
	 * @param cc
	 * @return
	 */
	public Conta getConta(String cc) throws Exception {
		if(!contas.containsKey(cc))
			throw new Exception("Conta inexistente! "+cc);
		return contas.get(cc);
	}

}
