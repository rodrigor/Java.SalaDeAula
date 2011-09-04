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
package com.rodrigor.exemplos.banco.corretora;

import java.util.Date;

import com.rodrigor.exemplos.banco.bancocomum.Transacao;

/**
 * @author rodrigor
 * @since Apr 1, 2011
 * 
 */
public class TransacaoCompraVenda implements Transacao{

	/* (non-Javadoc)
	 * @see com.rodrigor.exemplos.banco.bancocomum.Transacao#getId()
	 */
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.exemplos.banco.bancocomum.Transacao#getValor()
	 */
	@Override
	public float getValor() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.exemplos.banco.bancocomum.Transacao#getData()
	 */
	@Override
	public Date getData() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.exemplos.banco.bancocomum.Transacao#getDescricao()
	 */
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

}
