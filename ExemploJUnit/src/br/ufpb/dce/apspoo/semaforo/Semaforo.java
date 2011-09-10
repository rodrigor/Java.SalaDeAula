package br.ufpb.dce.apspoo.semaforo;

public class Semaforo {

	public static final int VERMELHO = 0;
	public static final int AMARELO = 1;
	public static final int VERDE = 2;
	
    int estado = VERMELHO;
	
	public Semaforo(){
		
	}
	
	
	public int mudarEstado(){
		if (estado == VERMELHO)
			estado = VERDE;
		else if(estado == VERDE)
			estado = AMARELO;
		else estado = VERMELHO;
		return estado;
	}
	
	public int getEstado(){
		return estado;
	}
}
