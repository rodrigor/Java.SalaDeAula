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


package com.rodrigor.exemplos.hometheater.equipamento;

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class Canal {
	
	private Integer numero;
	private String nome;
	
	public Canal(Integer num, String nome){
		this.numero = num;
		this.nome = nome;
	}
	
	public Canal(){
	}

	/**
	 * @return
	 */
	public Integer getNumero() {
		return this.numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

}
