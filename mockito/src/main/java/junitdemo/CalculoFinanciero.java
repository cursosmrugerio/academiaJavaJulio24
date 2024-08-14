package junitdemo;

public class CalculoFinanciero {
	
	
	CalculoFinancieroCloud cfc; //<= HELP MOCKITO
	
	//@Autowired
	public CalculoFinanciero(CalculoFinancieroCloud cfc) {
		this.cfc = cfc;
	}

	double ejecuta(long l, float f, int i,byte b) {
	
		//DELEGAR
	    double resultado =  cfc.ejecutaOperacionCompleja(l,f,i,b);
	    
	    return resultado;
	    
	}

}
