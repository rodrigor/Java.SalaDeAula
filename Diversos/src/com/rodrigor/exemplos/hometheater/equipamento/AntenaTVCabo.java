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


package com.rodrigor.exemplos.hometheater.equipamento;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class AntenaTVCabo {
	
	private List<Canal> listaCanais;
	private Map<Integer,Canal> mapCanais;
	
	public AntenaTVCabo(){
		this.listaCanais = new LinkedList<Canal>();
		this.mapCanais = new HashMap<Integer,Canal>();
	}
	
	public boolean existeCanal(int numero){
		return mapCanais.containsKey(numero);
	}
	
	public Canal getCanal(int numeroCanal){
		return this.mapCanais.get(numeroCanal);
	}
	
	public Iterator<Canal> getCanais(){
		return listaCanais.iterator();
	}
	
	public void addCanal(Canal c){
		this.listaCanais.add(c);
		this.mapCanais.put(c.getNumero(), c);
	}

}
