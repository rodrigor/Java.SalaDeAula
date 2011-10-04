package br.ufpb.dce.apspoo.decorator.sorvete;


public class ChocolateDecorator extends SorveteDecorator {

	private String nomeChocolate;
	private Double precoChocolate;
	
	public ChocolateDecorator(Sorvete componente) {
		super(componente);
	}
	
	public String getSabor(){
		return nomeChocolate+","+componente.getSabor();
	}
	
	public Double getPreco(){
		return precoChocolate+componente.getPreco();
	}
	
	public void setPrecoChocolate(Double preco){
		this.precoChocolate = preco;
	}
	
	public void setNome(String nome){
		this.nomeChocolate = nome;
	}

}
