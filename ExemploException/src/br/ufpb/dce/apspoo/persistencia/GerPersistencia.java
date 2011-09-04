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
package br.ufpb.dce.apspoo.persistencia;

import br.ufpb.dce.apspoo.banco.Agencia;
import br.ufpb.dce.apspoo.banco.Conta;

/**
 * @author rodrigor
 *
 * @since Aug 29, 2011
 */
public interface GerPersistencia {

	/**
	 * @param c
	 */
	void gravar(Conta c) throws PersistenciaException;

	/**
	 * @param a
	 */
	void gravar(Agencia a);

}
