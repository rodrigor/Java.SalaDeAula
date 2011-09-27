package br.ufpb.dce.apspoo.decorator.formulario;

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
		this.erro = "";
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


	public String getID() {
		return id;
	}
	
	public void setValor(String valor){
		this.valor = valor;
	}

}
