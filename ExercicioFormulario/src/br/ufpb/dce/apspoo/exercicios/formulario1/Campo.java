package br.ufpb.dce.apspoo.exercicios.formulario1;

public class Campo {
	
	private Validador validador;
	private String label;
	private String id;
	private String valor;
	private String erro;
	
	
	public Campo(String label, String id, Validador validador){
		this.label = label;
		this.id = id;
		this.validador = validador;
		this.erro = null;
	}
	
	
	public boolean validar(){
		try{
			validador.validar(this.valor);
			return true;
		}catch(ValorInvalidoException e){
			this.erro = e.getMessage();
			return false;
		}
	}
	
	public String getErro(){
		return this.erro;
	}


	public String getLabel() {
		return this.label;
	}
	
	public void setValor(String valor){
		this.valor = valor;
	}


	public String getValor() {
		return this.valor;
	}

}
