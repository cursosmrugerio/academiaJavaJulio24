package cast;

public class PrincipalPrimitivos {

	public static void main(String[] args) {

		byte b;
		int i;
		
		i = 10;
		b = (byte)i; //Downcasting
		
		i = b; //Upcasting
		
		System.out.println("byte: "+b);
		
		double d = 5.0;
		i = (int)d;
		
		System.out.println("int: "+i);

		b = 5;
		i = b;
		
		float f = 4.0F;
		
		System.out.println(Integer.MAX_VALUE);
		
		long l = 2_147_483_648L;
		
		i = (int)l;
		
		System.out.println(i);
		
		byte b1 = 5;
		byte b2 = 8;
		
		byte b3 = (byte)(b1 + b2);
		
		System.out.println(b3);
		
		b2 += b1;
		
		System.out.println(b2);
		
		System.out.println("*****char***");
		
		char c1 = 65;
		System.out.println("c1: "+ c1);
		
		char c2 = 'B';
		System.out.println("c2: "+(int)c2);
		
		short sh1 = 4;
		short sh2 = 8;
		
		int sh3 = sh1 * sh2;
		
		System.out.println(sh2 *= sh1);

		
	}

}
