package junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class MockitoTest {
	
	@Mock
	CalculoFinancieroCloud cfc; //<= SIN ACCESO A LA IMPLEMENTACIÓN
	
	CalculoFinanciero cf;
	
	@BeforeEach
    public void setUp() {
		cfc = mock(CalculoFinancieroCloud.class);
    	cf = new CalculoFinanciero(cfc);
	}
	
	@Test
	void test() {
		when(cfc.ejecutaOperacionCompleja(1,2F,3,(byte)4)).thenReturn(123.45);
		double resultado = cf.ejecuta(1,2F,3,(byte)4);
		assertEquals(123.45,resultado);
		
		// Verificamos que se llamó al mock con los argumentos correctos
        verify(cfc).ejecutaOperacionCompleja(1L,2F,3,(byte)4);
	}
	

}
