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
package br.ufpb.dce.apspoo.persistencia.arquivo;

import java.io.IOException;

import br.ufpb.dce.apspoo.banco.Agencia;
import br.ufpb.dce.apspoo.banco.Conta;
import br.ufpb.dce.apspoo.persistencia.GerPersistencia;
import br.ufpb.dce.apspoo.persistencia.PersistenciaException;

/**
 * @author rodrigor
 *
 * @since Aug 29, 2011
 */
public class GerPersistenciaArquivo implements GerPersistencia {

	/* (non-Javadoc)
	 * @see br.ufpb.dce.apspoo.persistencia.GerPersistencia#gravar(br.ufpb.dce.apspoo.banco.Conta)
	 */
	@Override
	public void gravar(Conta c) throws PersistenciaException {
		
		try{
		   throw new IOException();
		}catch(IOException e){
			throw new PersistenciaException(e);
		}
		// TODO Auto-generated method stub
		// Gravar em arquivo!!

	}

	/* (non-Javadoc)
	 * @see br.ufpb.dce.apspoo.persistencia.GerPersistencia#gravar(br.ufpb.dce.apspoo.banco.Agencia)
	 */
	@Override
	public void gravar(Agencia a) {
		// TODO Auto-generated method stub
		
	}

}
