package br.ufpb.dce.apspoo.decorator.formulario;

public class ValidadorLong implements Validador {

	private int min;
	private int max;
	
	public ValidadorLong(int min,int max){
		this.min = min;
		this.max = max;
	}
	
	@Override
	public void validar(String valor) throws ValorInvalidoException{
		try{
			long v = Long.parseLong(valor);
			if(v < min)
				throw new ValorInvalidoException("valor � menor que "+min);
			if(v > max)
				throw new ValorInvalidoException("valor � maior que "+max);
		}catch(NumberFormatException e){
			throw new ValorInvalidoException("valor n�o � um inteiro");
		}
		

	}

}
