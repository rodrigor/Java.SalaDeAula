package br.ufpb.dce.apspoo.decorator.salario;

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
