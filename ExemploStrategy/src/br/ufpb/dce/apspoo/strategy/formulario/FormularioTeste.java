package br.ufpb.dce.apspoo.strategy.formulario;

public class FormularioTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Formulario form = new Formulario("Cadastro PIBIC");
		form.addCampo(new Campo("Nome","nome",new ValidadorTexto(30)));
		form.addCampo(new Campo("Idade","idade",new ValidadorNumerico(0,150)));
		
	}

}
