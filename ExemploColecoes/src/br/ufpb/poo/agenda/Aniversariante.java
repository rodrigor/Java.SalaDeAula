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
package br.ufpb.poo.agenda;

/**
 * @author rodrigor
 *
 * @since Sep 2, 2011
 */
public class Aniversariante {
	
	private String nome;
	private int dd;
	private int mm;
	
	/**
	 * @param string
	 * @param i
	 * @param j
	 */
	public Aniversariante(String nome, int dd, int mm) {
		this.setNome(nome);
		this.dd = dd;
		this.mm = mm;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


}
