package com.rodrigor.exemplos.tdd.banco;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.rodrigor.exemplos.tdd.banco.Banco;
import com.rodrigor.exemplos.tdd.banco.BancoException;
import com.rodrigor.exemplos.tdd.banco.CNPJValidationException;

public class BancoTest {

	private Banco banco;
	
	@Before
	public void setUp() {
		banco = new Banco();
	}
	
	@Test
	public void testCNPJ(){
		banco.setCNPJ("12345678901234");
		
		assertEquals("12345678901234",banco.getCNPJ());
		
		try{
			banco.setCNPJ(null);
			fail("CNPJ n�o deve aceitar null");
		}catch(CNPJValidationException e){
			assertEquals("CNPJ Inv�lido!: null",e.getMessage());
		}
		
		try{
			banco.setCNPJ("1234567890123456");
			fail("CNPJ deve aceitar n�meros com apenas 14 caracteres");
		}catch(CNPJValidationException e){
			assertEquals("CNPJ Inv�lido: 1234567890123456",e.getMessage());
		}
		
		try{
			banco.setCNPJ("1234567890123");
			fail("CNPJ deve aceitar n�meros com apenas 14 caracteres");
		}catch(CNPJValidationException e){
			assertEquals("CNPJ Inv�lido: 1234567890123",e.getMessage());
		}
		
		try{
			banco.setCNPJ("aksjdhakdjhajh");
			fail("CNPJ deve aceitar apenas d�gitos");
		}catch(CNPJValidationException e){
			assertEquals("CNPJ Inv�lido: aksjdhakdjhajh",e.getMessage());
		}
	}
	
	@Test
	public void testAgencias(){
		Banco banco = new Banco();
		
		banco.criarAgencia("111-X","Mag Shopping");
		assertNotNull(banco.getAgencia("111-X"));
		assertEquals("Mag Shopping",banco.getAgencia("111-X").getNome());

		try{
			banco.criarAgencia("111-X","Mag Shopping");
			fail("O sistema n�o deve aceitar duas ag�ncias com o mesmo c�digo!");
		}catch(BancoException e){
			assertEquals("Agencia ja existente: 111-X",e.getMessage());
		}
		
	}

}
