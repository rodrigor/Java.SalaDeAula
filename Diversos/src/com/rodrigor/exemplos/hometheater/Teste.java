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


package com.rodrigor.exemplos.hometheater;

import com.rodrigor.exemplos.hometheater.equipamento.AntenaTVCabo;
import com.rodrigor.exemplos.hometheater.equipamento.Canal;
import com.rodrigor.exemplos.hometheater.equipamento.DVD;
import com.rodrigor.exemplos.hometheater.equipamento.DVDPlayer;
import com.rodrigor.exemplos.hometheater.equipamento.DVDRuntimeException;
import com.rodrigor.exemplos.hometheater.equipamento.Televisao;

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class Teste {
	
	public static void main(String[] args){

		AntenaTVCabo antena = new AntenaTVCabo();
		antena.addCanal(new Canal(7,"Globo"));
		antena.addCanal(new Canal(5,"TVS"));
		antena.addCanal(new Canal(3,"Manchete"));
		
		Televisao tv = new Televisao();
		tv.plugarAntena(antena);
		
		try{
			DVDPlayer dvdPlayer = new DVDPlayer();
			dvdPlayer.inserirDVD(new DVD("StarWars IV"));
			System.out.println(dvdPlayer);
			dvdPlayer.play();
			System.out.println(dvdPlayer);
			dvdPlayer.play();
			System.out.println(dvdPlayer);
		}catch(DVDRuntimeException e){
			
		}

		
		
//		
//		try{
//			tv.mudarCanal(7);
//			System.out.println(tv);
//			tv.mudarCanal(50);
//		}catch(TelevisaoException e){
//			e.printStackTrace();
//		}catch(Exception e){
//			System.out.println("Erro inesperado! :"+ e.getMessage());
//		}
	}

}
