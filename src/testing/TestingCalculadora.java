package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import negocio.CalculadoraDao;
import negocio.CalculadoraDaoImpl;

class TestingCalculadora {
	
	@Test
	void test() {
		CalculadoraDao cdao = new CalculadoraDaoImpl();
		assertAll(
			()-> assertEquals(12, cdao.sumar(8, 4)),
			()-> assertEquals(4, cdao.restar(8, 4)),
			()-> assertEquals(32, cdao.multiplicar(8, 4)),
			()-> assertEquals(2, cdao.dividir(8, 4))
			
		);
	}

}
