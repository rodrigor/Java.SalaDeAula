package com.rodrigor.exemplos.tdd.banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.rodrigor.exemplos.tdd.banco.Agencia;

public class AgenciaTest {

	private Agencia ag;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCodigo() {
		ag = new Agencia("xxx","Nome");
		assertEquals("xxx",ag.getCodigo());
		assertEquals("Nome",ag.getNome());
	}

	@Test
	public void testSetNome() {
		fail("Not yet implemented");
	}

}
