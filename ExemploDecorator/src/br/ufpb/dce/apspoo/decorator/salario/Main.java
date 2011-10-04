package br.ufpb.dce.apspoo.decorator.salario;

public class Main {

	
	public static void main(String[] args) {
		Professor p = new Professor();
		p.setCalculadorSalario(new CalculadorSalarioCoordenador());
		System.out.println(p.getSalario());
		System.out.println(p.getCargo());
	}
}
