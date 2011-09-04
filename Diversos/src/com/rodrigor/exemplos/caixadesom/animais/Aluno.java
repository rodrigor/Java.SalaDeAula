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
package com.rodrigor.exemplos.caixadesom.animais;

import com.rodrigor.exemplos.caixadesom.caixa.EmissorDeSom;

/**
 * @author rodrigor
 * @since Mar 17, 2011
 * 
 */
public class Aluno implements EmissorDeSom{
	
	public String falar(){
		return "besteira";
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.exemplos.caixadesom.caixa.EmissorDeSom#emitirSom()
	 */
	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return falar();
	}

}
