package br.ufpb.dce.apspoo.exercicios.formulario1;

import java.util.LinkedList;
import java.util.List;

public class Formulario {
	
	private List<Campo> campos;
	private String nome;
	
	public Formulario(){
		this("");
	}
	
	public Formulario(String nome){
		this.nome = nome;
		this.campos = new LinkedList<Campo>();
	}
	
	public void addCampo(Campo campo){
		this.campos.add(campo);
	}

	public List<Campo> getCampos() {
		return campos;
	}

}
