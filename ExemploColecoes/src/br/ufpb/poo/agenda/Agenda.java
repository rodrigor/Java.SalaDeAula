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

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author rodrigor
 *
 * @since Sep 2, 2011
 */
public class Agenda {
	
	private LinkedList<Aniversariante> nivers;
	private HashMap<String,Aniversariante> niversMap;
	
	public Agenda(){
		this.nivers = new LinkedList<Aniversariante>();
		this.niversMap = new HashMap<String,Aniversariante>();
	}
	
	public void addAniversariante(Aniversariante aniversariante){
		this.nivers.add(aniversariante);
		this.niversMap.put(aniversariante.getNome(), aniversariante);
	}
	
	public Iterator<Aniversariante> getAniversariantes(){
		return nivers.iterator();
	}

	/**
	 * @param string
	 * @return
	 */
	public Aniversariante getAniversariante(String nome) throws AniversarianteInexistenteException {
		if(!niversMap.containsKey(nome))
			throw new AniversarianteInexistenteException(nome);
		return niversMap.get(nome);
	
	}

}
