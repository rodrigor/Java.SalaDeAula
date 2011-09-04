package com.rodrigor.exemplos.tdd.banco;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Banco {

	private final int TAM_CNPJ = 14;
	
	private String cnpj;
	
	private Map<String,Agencia> mapAgencias;
	
	public Banco(){
		mapAgencias = new HashMap<String,Agencia>();
	}
	

	public void setCNPJ(String cnpj){
		if(cnpj == null)
			throw new CNPJValidationException("CNPJ Inv�lido!: null");
		if(!cnpj.matches("\\d{14}")){
			throw new CNPJValidationException("CNPJ Inv�lido: "+cnpj);
		}
		this.cnpj = cnpj;
	}

	public String getCNPJ() {
		return cnpj;
	}

	public void criarAgencia(String codigo, String nome) {
		if(mapAgencias.containsKey(codigo))
			throw new BancoException("Agencia ja existente: "+codigo);
		Agencia ag = new Agencia(codigo,nome);
		this.mapAgencias.put(ag.getCodigo(), ag);
	}


	public Agencia getAgencia(String codigo) {
		return mapAgencias.get(codigo);
	}
}
