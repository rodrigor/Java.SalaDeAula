package com.rodrigor.exemplos.tdd.banco;

public class Agencia {
	
	private String codigo;
	private String nome;

	public Agencia(String codigo, String nome) {
		this.setCodigo(codigo);
		this.setNome(nome);
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
