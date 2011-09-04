/**
 * Autor: Rodrigo Rebouças de Almeida
 * http://www.rodrigor.com
 * (cc) Creative Commons 2011
 *
 * Este código fonte está licenciado sob uma Licença 
 * Creative Commons Atribuição-Compartilhamento 3.0 Brasil. 
 * Para ver uma cópia desta licença, visite:
 * http://creativecommons.org/licenses/by-sa/3.0/br/
 */
package br.ufpb.dce.apspoo.banco;

public class Conta {
	
	//TODO: Mudar para cole��o de transa��es
	private Double saldo;
	private String numero;
	
	public Conta(String num){
		this.numero = num;
	}
	
	public void sacar(Double valor) throws SaldoInsuficienteException{
		if(valor > saldo)
			throw new SaldoInsuficienteException();
		saldo -=valor;
	}

}
