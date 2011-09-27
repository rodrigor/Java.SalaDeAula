package br.ufpb.dce.apspoo.decorator.formulario;

public class ValidadorSenhaDecorator extends ValidadorDecorator {

	public ValidadorSenhaDecorator(Validador componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}	
	
	
	@Override
	public void validar(String valor) throws ValorInvalidoException{
		super.validar(valor);
		//@TODO Mudar para usar express‹o regular
		char n = valor.charAt(0);
		for ( int i=1; i < valor.length(); i++){
			if( n == valor.charAt(i))
				throw new ValorInvalidoException("Senha invalida"+valor);
		}
		
	}

}
