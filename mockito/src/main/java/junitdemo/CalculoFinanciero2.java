package junitdemo;

public class CalculoFinanciero2 {
	
	//CONTEXTO DONDE MI NEGOCIO TOMA LA RESPONSABILIDAD DEL CALCULO
	double ejecuta(long l, float f, int i,byte b) {
		
		// Simula una operación compleja con los parámetros
	    double resultado = Math.pow(l, b) / (f + 0.1) - i 
	    	* Math.sin((double)b) + Math.log1p((double)i);

	    // Asegúrate de que el resultado no sea un número negativo o NaN antes de devolver
	    if(Double.isNaN(resultado) || resultado < 0) {
	        resultado = 0;
	    }
	    
	    return resultado;
	    
	}

}
