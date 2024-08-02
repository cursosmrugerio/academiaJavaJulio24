package jUnitPatternComposite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestComposite {

	@Test
	void test() {
		double d1 = 4.0;
		double d2 = 8.0;
		assertEquals(d1,d2/2);
	}
	
	@Test
	void testConstante() {
		double d = 15.0;
		Componente c = new LeafConstante(d);
		assertEquals(d, c.getValor());
	}
	
	@Test
	void testSumaSimple() {
		double d1 = 15.0;
		double d2 = 5.0;
		Componente c1 = new LeafConstante(d1);
		Componente c2 = new LeafConstante(d2);
		
		Componente cSuma = new ComponentSuma(c1,c2);
		assertEquals(d1+d2, cSuma.getValor());
	}
	
	@Test
	void testSumaCompleja() {
		double d1 = 1.0;
		double d2 = 2.0;
		double d3 = 3.0;
		double d4 = 4.0;
		Componente c5 = new LeafConstante(5.0);
		
		Componente cSuma = new ComponentSuma(
								new ComponentSuma(
										new LeafConstante(d1),
										new ComponentSuma(
											new LeafConstante(d3),
											new LeafConstante(d4)
										)
									),
								new ComponentSuma(
										c5,
										new LeafConstante(d2)	
									)
								);
		
		assertEquals(d1+d2+d3+d4+c5.getValor(), cSuma.getValor());
	}
	
	

}
