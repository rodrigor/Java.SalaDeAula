package br.ufpb.dce.apspoo.exercicios.formulario1;

import java.util.Scanner;

public class FormularioTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Formulario form = new Formulario("Cadastro Usuario");
		form.addCampo(new Campo("Nome","nome",new ValidadorTexto(30)));
		form.addCampo(new Campo("Idade","idade",new ValidadorNumerico(0,150)));
		
		
		
		boolean valido;
		for(Campo c: form.getCampos()){
			do{
				System.out.print(c.getLabel()+":");
				c.setValor(new Scanner(System.in).next());
				valido = c.validar();
				if(!valido)
					System.out.println("> ERRO: "+c.getErro());
			}while(!valido);
		}
	}

}
