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

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class Televisao extends EquipamentoEletronico{

	private int volume = 0;
	private Canal canal;
	private AntenaTVCabo antena;
	
	
	public void plugarAntena(AntenaTVCabo antena){
		this.antena = antena;
	}
	
	public void mudarCanal(int numero) throws TelevisaoException{
		if (!this.antena.existeCanal(numero))
			throw new TelevisaoException("Canal inexistente");
		canal = antena.getCanal(numero);
		
	}
	
	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("Televisao\n");
		buffer.append("\tVolume: "+this.volume+"\n");
		buffer.append("\tCanal: "+this.canal.getNome());
		return buffer.toString();
	}

}
