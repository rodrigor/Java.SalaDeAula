package br.ufpb.dce.apspoo.decorator.formulario;

public class ValidadorEmailDecorator extends ValidadorDecorator {

	public ValidadorEmailDecorator(Validador componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void validar(String valor) throws ValorInvalidoException{
		super.validar(valor);
		
		if( valor.indexOf("@") < 0)
			throw new ValorInvalidoException("Email invalido");
	}

}
