package br.ufpb.dce.apspoo.decorator.formulario;

public class ValidadorDecorator implements Validador{
	
	private Validador componente;
	
	public ValidadorDecorator(Validador componente){
		this.componente = componente;
	}

	@Override
	public void validar(String valor) throws ValorInvalidoException {
		this.componente.validar(valor);
	}
	
	

}
