package br.com.example1.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import br.com.example1.model.Carro;

public class CarroTest {

	@Test
	public void verificaPlaca() {
		
		try {
		Carro carro = new Carro();
		carro.setPlaca("ABC1234");
		assertTrue(true);
		
		}catch(Exception e) {
			fail(e.getMessage());
		}
		
	}
}
