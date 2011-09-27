package br.ufpb.dce.apspoo.decorator.formulario;

public interface Validador {
	
	public void validar(String valor) throws ValorInvalidoException;

}
