package br.ufpb.dce.apspoo.decorator.sorvete;


public class SorveteDecorator implements Sorvete {
	
	protected Sorvete componente;

	public SorveteDecorator(Sorvete componente){
		this.componente = componente;
	}
	
	@Override
	public String getSabor() {
		return componente.getSabor();
	}

	@Override
	public Double getPreco() {
		return componente.getPreco();
	}

}
