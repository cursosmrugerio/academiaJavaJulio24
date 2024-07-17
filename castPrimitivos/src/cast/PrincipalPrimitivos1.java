package cast;

import java.math.BigDecimal;

public class PrincipalPrimitivos1 {

	public static void main(String[] args) {

		int i1 = 5;
		int i2 = 5;
		
		System.out.println(i1==i2); //true

		Integer integer1 = new Integer(5);
		Integer integer2 = new Integer(5);
		
		System.out.println(integer1==integer2); //false
		
		Integer integer3 = Integer.valueOf(5);
		Integer integer4 = Integer.valueOf(5);
		
		System.out.println(integer3==integer4); //true
		
		Integer integer5 =Integer.valueOf(128);
		Integer integer6 = Integer.valueOf(128);
		
		System.out.println(integer5==integer6); //false

		//CACHE INTEGERS -128 AL 127
		
		Integer integer7 = 127; //AUTOBOXING
		int i3 = Integer.valueOf(127); //UNBOXING
		
		Integer[] numeros = {1, Integer.valueOf(2), 3, 4, 5};
		
		for (Integer i:numeros) {
			System.out.println(i);
		}
		
		System.out.println("**************");
		
		Integer integer8 = 127;
		Integer integer9 = 127;
		
		System.out.println(integer8 == integer9);

		Integer integer10 = 128;
		Integer integer11 = 128;
		
		System.out.println(integer10 == integer11);
		
		System.out.println("**************");

		double a = 0.02;
		double b = 0.03;
		double c = b - a;
		System.out.println(c); //0.01

		double d1 = 0.3;
	    double d2 = 0.2;
	    System.out.println("Double:\t 0,3 - 0,2 = " + (d1 - d2));

	    float f1 = 0.3f;
	    float f2 = 0.2f;
	    System.out.println("Float:\t 0,3 - 0,2 = " + (f1 - f2));
	    
	    System.out.println("**********");
	    
	    BigDecimal _a = new BigDecimal("0.02");
	    BigDecimal _b = new BigDecimal("0.03");
	    BigDecimal _c = _b.subtract(_a);
	    System.out.println(_c);
	    
	    BigDecimal bd1 = new BigDecimal("0.3");
	    BigDecimal bd2 = new BigDecimal("0.2");
	    System.out.println("BigDec:\t 0,3 - 0,2 = " + (bd1.subtract(bd2)));
		
	    
	    double d3 = 2.3;
	    double d4 = 1.2;
	    double d5 = d3 - d4;
	    System.out.println(d5);
	}

}
