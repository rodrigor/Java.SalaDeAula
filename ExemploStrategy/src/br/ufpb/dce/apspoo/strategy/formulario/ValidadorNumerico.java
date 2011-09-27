package br.ufpb.dce.apspoo.strategy.formulario;

public class ValidadorNumerico implements Validador {

	private int min;
	private int max;
	
	public ValidadorNumerico(int min,int max){
		this.min = min;
		this.max = max;
	}
	
	@Override
	public void validar(String valor) throws ValorInvalidoException{
		try{
			int v = Integer.parseInt(valor);
			if(v < min)
				throw new ValorInvalidoException("valor � menor que "+min);
			if(v > max)
				throw new ValorInvalidoException("valor � maior que "+max);
		}catch(NumberFormatException e){
			throw new ValorInvalidoException("valor n�o � um inteiro");
		}
		

	}

}
