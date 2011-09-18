package br.ufpb.dce.rodrigor.apspoo.p20111.prova1.q1;

public class Produto {
	
    private String nome;
	private float preco;
	private int codigo;
	
	public Produto(){
		this.codigo = 0;
	}
	public Produto(String nome,int codigo, float preco){
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public void setPreco(float p) {
		this.preco = p;
		
	}

	public void setCodigo(int c) {
		this.codigo = c;
		
	}

	public float getPreco() {
		return this.preco;
	}

	public int getCodigo() {
		return this.codigo;
	}

}
