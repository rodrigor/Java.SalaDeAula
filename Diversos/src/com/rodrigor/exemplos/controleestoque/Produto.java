package com.rodrigor.exemplos.controleestoque;

public class Produto {

	private Integer codigo;
	private String nome;
	private String descricao;

	private Float preco;
	private Integer estoque;
	
	public Produto(){
		this.codigo = 0;
		this.nome = "";
		this.descricao = "";
		preco = 0.0f;
		estoque = 0;		
	}
	
	/**
	 * Retorna o valor do codigo do produto
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the preco
	 */
	public Float getPreco() {
		return preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	/**
	 * @return the estoque
	 */
	public Integer getEstoque() {
		return estoque;
	}
	/**
	 * @param estoque the estoque to set
	 */
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	
	public String toString(){
		return "Nome do Produto: "+ this.nome+
		"\n Quantidade: "+this.estoque;
	}
	
	
}
