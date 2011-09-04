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
public class DVDPlayer extends EquipamentoEletronico{
	
	private DVD dvd;
			
	private Estado estadoAtual;

	public enum Estado {PLAY,PAUSE,STOP}

	public DVDPlayer(){
		estadoAtual = Estado.STOP; 
	}
	
	public void play(){
		if(dvd == null)
			throw new DVDRuntimeException("Sem DVD!");
		if(estadoAtual == Estado.PLAY)
			throw new DVDRuntimeException("Estado inválido: PLAY");
		this.estadoAtual = Estado.PLAY;
	}
	
	public void pause(){
		if(estadoAtual == Estado.PLAY)
			this.estadoAtual = Estado.PAUSE;
		if(estadoAtual == Estado.PAUSE)
			play();
	}
	
	public void stop(){
		estadoAtual = Estado.STOP;
	}
	
	public Estado getEstado(){
		return this.estadoAtual;
	}
	
	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("DVD Player \n");
		buffer.append("\tDVD: "+ (dvd == null? "Sem DVD": dvd.getTitulo())+"\n");
		buffer.append("\tEstado: "+this.estadoAtual+"\n");
		return buffer.toString();
	}

	/**
	 * @param dvd2
	 */
	public void inserirDVD(DVD dvd) {
		this.dvd = dvd;
		
	}

}
