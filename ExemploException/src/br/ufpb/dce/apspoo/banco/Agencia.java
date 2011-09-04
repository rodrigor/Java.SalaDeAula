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

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import br.ufpb.dce.apspoo.persistencia.GerPersistencia;
import br.ufpb.dce.apspoo.persistencia.PersistenciaException;

public class Agencia {
	
	private List<Conta> contas;
	private Map<String,Conta> contasMap;

	
	private String numero;
	private GerPersistencia gerPersistencia;
	
	public Agencia(String numero){
		this.contas = new LinkedList<Conta>();
		this.contasMap = new HashMap<String,Conta>();
		this.numero = numero; 
	}
	

	public Conta criarConta(String numero) throws ContaException{
		if(contasMap.containsKey(numero)){
			throw new ContaException();
		}
		Conta c = new Conta(numero);
		contas.add(c);
		contasMap.put(numero,c);
		try {
			gerPersistencia.gravar(c);
		} catch (PersistenciaException e) {
			throw new ContaException(e,this);
		}
		return c;
	}
	
	public Conta getConta(String numero){
		return contasMap.get(numero);
	}
	
	public Iterator<Conta> getContas(){
		return contas.iterator();
	}


	/**
	 * @param gerpersistencia
	 */
	public void setGerPersistencia(GerPersistencia gerpersistencia) {
		this.gerPersistencia = gerpersistencia;
		
	}

}
