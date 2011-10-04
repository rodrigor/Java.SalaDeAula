package br.ufpb.dce.apspoo.decorator.salario;

public class Professor {
	
	private String nome;
	private String matricula;
	
	private CalculadorSalario calc;
	
	public Professor(){
		calc = new CalculadorSalarioAuxiliar();
	}
	
	public void setCalculadorSalario(CalculadorSalario calc){
		this.calc = calc;
	}
	
	public double getSalario(){
		return this.calc.getSalario();
	}
	
	public String getCargo(){
		return this.calc.getCargo();
	}

}
