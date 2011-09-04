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
package com.rodrigor.testes;

/**
 * @author rodrigor
 * @since Apr 19, 2011
 * 
 */
public class Calculadora {
	
	
	public int dividir(int a, int b){
		if(b == 0)
			throw new ValorInvalidoException("Valor inválido! "+b);
		return a + b;
	}

}
