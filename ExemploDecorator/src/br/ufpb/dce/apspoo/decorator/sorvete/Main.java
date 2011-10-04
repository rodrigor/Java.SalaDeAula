package br.ufpb.dce.apspoo.decorator.sorvete;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Casquinha casca = new Casquinha();
		
		BolaDecorator chocolate = new BolaDecorator(casca);
		chocolate.setNome("Chocolate");
		chocolate.setPreco(3.5);
		
		BolaDecorator acai = new BolaDecorator(chocolate);
		acai.setNome("Açaí");
		acai.setPreco(10.0);
		
		ChocolateDecorator bis = new ChocolateDecorator(acai);
		bis.setNome("BIS");
		bis.setPrecoChocolate(0.5);
		
		ChocolateDecorator sonhoDeValsa = new ChocolateDecorator(bis);
		sonhoDeValsa.setNome("Sonho de Valsa");
		sonhoDeValsa.setPrecoChocolate(0.75);
		
		imprimirValor(sonhoDeValsa);
	}
	
	private static void imprimirValor(Sorvete s){
		System.out.println("Preço do sorvete "+s.getSabor()+":"+s.getPreco());
	}

}
