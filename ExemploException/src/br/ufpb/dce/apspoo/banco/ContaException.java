/**
 * Autor: Rodrigo Rebouças de Almeida
 * http://www.rodrigor.com
 * (cc) Creative Commons 2011
 *
 * Este código fonte está licenciado sob uma Licença 
 * Creative Commons Atribuição-Compartilhamento 3.0 Brasil. 
 * Para ver uma cópia desta licença, visite:
 * http://creativecommons.org/licenses/by-sa/3.0/br/
 */
package br.ufpb.dce.apspoo.banco;


public class ContaException extends Exception {

	
	private Agencia a;
	/**
	 * @param e
	 * @param string
	 */
	public ContaException(Throwable e, Agencia a) {
		super(e);
		this.a = a;
	}
	/**
	 * 
	 */
	public ContaException() {
		// TODO Auto-generated constructor stub
	}

}
