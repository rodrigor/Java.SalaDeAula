package br.ufpb.dce.apspoo.strategy.formulario;

public interface Validador {
	
	public void validar(String valor) throws ValorInvalidoException;

}
