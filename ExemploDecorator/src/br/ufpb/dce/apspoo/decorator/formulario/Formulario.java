package br.ufpb.dce.apspoo.decorator.formulario;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Formulario {
	
	private List<Campo> campos;
	private Map<String,Campo> mapCampo;
	private String nome;
	
	public Formulario(){
		this("");
	}
	
	public Formulario(String nome){
		this.nome = nome;
		this.campos = new LinkedList<Campo>();
		this.mapCampo = new HashMap<String,Campo>();
	}
	
	public void addCampo(Campo campo){
		this.campos.add(campo);
		this.mapCampo.put(campo.getID(), campo);
	}

	public Campo getCampo(String id) {
		return mapCampo.get(id);
	}

}
