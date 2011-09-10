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
import java.util.Map;

/**
 * @author rodrigor
 *
 * @since Aug 29, 2011
 */
public class Banco {

	
	private String nome;
	
	private int numero;
	
	private Map<String,Agencia> agenciasMap;

	
	/**
	 * @param string
	 * @param i
	 */
	public Banco(String nome, int numero) throws BancoException{
		if(nome.equals("")) throw new BancoException("Nome invalido");
		if(numero < 0) throw new BancoException("Numero invalido");
		agenciasMap = new HashMap<String,Agencia>();
		this.nome = nome;
		this.numero = numero;
	}

	/**
	 * @param string
	 */
	public Agencia criarAgencia(String numero) throws ContaException{
		Agencia a = new Agencia(numero);
		agenciasMap.put(numero,a);
		return a;
	}

	String getNome(){
		return this.nome;
	}
	
	int getNumero(){
		return this.numero;
	}
	
}
