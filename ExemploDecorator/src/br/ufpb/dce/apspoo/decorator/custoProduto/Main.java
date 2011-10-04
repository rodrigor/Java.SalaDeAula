package br.ufpb.dce.apspoo.decorator.custoProduto;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Produto file = new Produto("File");
		
		CustoAquisicao custoBase = new CustoAquisicao(15.0);
		CustoFuncionarioDecorator func = new CustoFuncionarioDecorator(custoBase);
		CustoIngredienteDecorator sal = new CustoIngrediente(func);
		sal.setPreco(0.30);
		CustoIngredienteDecorator oleo = new CustoIngrediente(sal);
		oleo.setPreco(5.0);
		
		CustoIngredienteDecorator cebola = new CustoIngrediente(oleo);
		cebola.setPreco(0.75);
		
		file.setCalculadorCusto(cebola);
		
		Produto feijao = new Produto("Televisao");
		feijao.setCalculadorCusto(new ProdutoEletronicoCalculadorCusto());
		
		System.out.println(file.calcularCusto());

	}

}
