package br.ufpb.dce.apspoo.exemplodecorator;

public class CalculadorSalarioCoordenador implements CalculadorSalario {

	@Override
	public double getSalario() {
		return 1500;
	}

	@Override
	public String getCargo() {
		return "Coordenador";
	}


}
