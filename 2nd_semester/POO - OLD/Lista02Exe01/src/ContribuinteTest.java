import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContribuinteTest {

	@Test
	void testSetUf() {
		fail("Not yet implemented");
	}

	@Test
	void testSetRendaAnual() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularImposto_3000_impostoZero() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(3000);
		
		double imposto = c.calcularImposto();
		
		assertEquals(0, imposto);
	}
	
	@Test
	void testCalcularImposto_9000_imposto522() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(9000);
		
		double imposto = c.calcularImposto();
		
		assertEquals(522, imposto);
	}
	
	@Test
	void testCalcularImposto_10000_imposto1500() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(10000);
		
		double imposto = c.calcularImposto();
		
		assertEquals(1500, imposto);
	}
	
	@Test
	void testCalcularImposto_3491173_imposto960072() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(34911.73);
		
		double imposto = c.calcularImposto();
		
		assertEquals(9600.72, imposto, 0.009);
	}
	
	

}
