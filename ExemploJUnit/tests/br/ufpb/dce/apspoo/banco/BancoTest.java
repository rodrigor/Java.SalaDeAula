package br.ufpb.dce.apspoo.banco;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BancoTest {
	
	private Banco banco;

	@Before
	public void setUp() throws Exception {
		banco = new Banco("BancoBrasil",001);
	}

	@Test
	public void testConstrutor() {
		assertEquals("BancoBrasil",banco.getNome());
		assertEquals(1,banco.getNumero());
		
		try{
			banco = new Banco("",-1);
			fail("BancoException deveria ter sido lançada");
		}catch(BancoException e){
			assertEquals("Nome invalido",e.getMessage());
		}
		
		try{
			banco = new Banco("Caixa",-1);
			fail("BancoException deveria ter sido lançada");
		}catch(BancoException e){
			assertEquals("Numero invalido",e.getMessage());
		}
	}

	@Test
	public void testAgencias() {
		
		try {
			Banco b2 = new Banco("Caixa",123);
		} catch (BancoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		int[] i = new int[3];
		i[6] = 0;
		
		try {
			banco.criarAgencia("123123");
		} catch (ContaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
