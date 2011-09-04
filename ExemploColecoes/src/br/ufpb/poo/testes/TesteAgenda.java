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
package br.ufpb.poo.testes;

import java.util.Iterator;

import br.ufpb.poo.agenda.Agenda;
import br.ufpb.poo.agenda.Aniversariante;
import br.ufpb.poo.agenda.AniversarianteInexistenteException;

/**
 * @author rodrigor
 *
 * @since Sep 2, 2011
 */
public class TesteAgenda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		agenda.addAniversariante(new Aniversariante("Joao",23,12));
		agenda.addAniversariante(new Aniversariante("Maria",22,03));
		agenda.addAniversariante(new Aniversariante("Joana",12,11));
	
		
		try {
			Aniversariante m = agenda.getAniversariante("Mariassss");
		} catch (AniversarianteInexistenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(m.getDia()+"/"+m.getMes());
		
		Iterator<Aniversariante> it = agenda.getAniversariantes();
		while(it.hasNext()){
			System.out.println(it.next().getNome());
		}
		
	}
	
}
