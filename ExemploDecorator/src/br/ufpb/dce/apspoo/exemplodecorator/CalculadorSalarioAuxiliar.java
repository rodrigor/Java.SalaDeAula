package br.ufpb.dce.apspoo.exemplodecorator;

public class CalculadorSalarioAuxiliar implements CalculadorSalario {

	

	@Override
	public double getSalario() {
		return 1000;
	}

	@Override
	public String getCargo() {
		return "Professor Auxiliar";
	}
}
