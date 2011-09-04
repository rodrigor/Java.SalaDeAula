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
public class Banco {
	
	private Map<String,Agencia> agencias;
	private int numero;
	private String nome;
	
	
	public Banco(int num, String nome){
		this.numero = num;
		this.nome = nome;
		this.agencias = new HashMap<String,Agencia>();
	}
	
	
	public Agencia criarAgencia(String num){
		Agencia ag = new Agencia(num);
		agencias.put(num,ag);
		return ag;
	}


	/**
	 * @param ag
	 * @return
	 */
	public Agencia getAgencia(String ag) {
		return agencias.get(ag);
	}

}
