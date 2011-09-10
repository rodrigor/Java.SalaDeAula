package br.ufpb.dce.apspoo.semaforo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SemaforoTest {

	
	Semaforo sem;
	@Before
	public void setUp() throws Exception {
		sem = new Semaforo();
	}

	@Test
	public void testEstado() {
		assertEquals(Semaforo.VERMELHO, sem.getEstado());
		sem.estado = Semaforo.AMARELO;
		assertEquals(Semaforo.VERMELHO,sem.mudarEstado());
	}

}
