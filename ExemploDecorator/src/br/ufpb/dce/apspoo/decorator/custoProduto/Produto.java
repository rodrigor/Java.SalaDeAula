package br.ufpb.dce.apspoo.decorator.custoProduto;


public class Produto {
	
	private String nome;
	private String descricao;
	private CalculadorCusto calculador;
	
	public void setCalculadorCusto(CalculadorCusto calculador){
		this.calculador = calculador;
	}

	public Double calcularCusto(){
		return this.calculador.calcularCusto();
	}

}
