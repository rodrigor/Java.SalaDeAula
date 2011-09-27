package br.ufpb.dce.apspoo.exemplostrategy;

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
