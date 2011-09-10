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


public class Agencia {
	
	private List<Conta> contas;
	private Map<String,Conta> contasMap;

	
	private String numero;
	
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

		return c;
	}
	
	public Conta getConta(String numero){
		return contasMap.get(numero);
	}
	
	public Iterator<Conta> getContas(){
		return contas.iterator();
	}



}
