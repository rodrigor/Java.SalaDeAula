package br.ufpb.dce.apspoo.decorator.sorvete;


public class BolaDecorator extends SorveteDecorator {

	private String sabor;
	private Double preco;
	
	public BolaDecorator(Sorvete componente) {
		super(componente);
	}
	
	public String getSabor(){
		return sabor+","+componente.getSabor();
	}
	
	public Double getPreco(){
		return preco+componente.getPreco();
	}
	
	public void setPreco(Double preco){
		this.preco = preco;
	}
	
	public void setNome(String nome){
		this.sabor = nome;
	}

}
