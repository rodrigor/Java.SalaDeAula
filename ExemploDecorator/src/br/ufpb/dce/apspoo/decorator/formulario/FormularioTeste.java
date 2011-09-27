package br.ufpb.dce.apspoo.decorator.formulario;

public class FormularioTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Formulario form = new Formulario("Cadastro PIBIC");
		form.addCampo(new Campo("Nome","nome",new ValidadorTexto(30)));
		form.addCampo(new Campo("Idade","idade",new ValidadorNumerico(0,150)));
		ValidadorTexto texto = new ValidadorTexto(300);
		ValidadorEmailDecorator vemail = new ValidadorEmailDecorator(texto);
		form.addCampo(new Campo("E-mail","email",vemail));
		form.addCampo(new Campo("Senha","senha",new ValidadorSenhaDecorator(new ValidadorNumerico(0,99999))));
		
		form.getCampo("senha").setValor("1111111");
		System.out.println("Valido? "+form.getCampo("senha").validar());
	}

}
