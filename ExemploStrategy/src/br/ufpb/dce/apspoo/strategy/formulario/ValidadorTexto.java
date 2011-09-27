package br.ufpb.dce.apspoo.strategy.formulario;

public class ValidadorTexto implements Validador {

	private int max;
	
	public ValidadorTexto(int max){
		this.max = max;
	}
	
	@Override
	public void validar(String valor) throws ValorInvalidoException{
		if (valor.length() > max)
			throw new ValorInvalidoException("O tamanho m‡ximo do valor Ž "+max);

	}

}
