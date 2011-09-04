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
package br.ufpb.dce.apspoo.bancobrasil;

import br.ufpb.dce.apspoo.banco.Banco;
import br.ufpb.dce.apspoo.banco.ContaException;
import br.ufpb.dce.apspoo.persistencia.arquivo.GerPersistenciaArquivo;

/**
 * @author rodrigor
 *
 * @since Aug 29, 2011
 */
public class BancoBrasil {
	
	public static void main(String[] args) {
		Banco b = new Banco("Banco do Brasil",001);
		b.setGerPersistencia(new GerPersistenciaArquivo());
		
		//..... 
		try {
			b.criarAgencia("123").criarConta("123");
		} catch (ContaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
