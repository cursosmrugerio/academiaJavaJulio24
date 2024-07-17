package cast;

public class PrincipalPrimitivos2 {
	
	public static void main(String[] args) {
		long l1 = 100;
		Long long1 = 100L;
		Byte byte1 = 100;
		Character char1 = 100;
		Double double1 = 5.5;
		
		Byte byte2 = Byte.valueOf((byte)127);
		Byte byte3 = Byte.valueOf((byte)127);
		
		System.out.println(byte2==byte3); 
		
		Short short1 = Short.valueOf((short)127);
		Short short2 = Short.valueOf((short)127);
		
		System.out.println(short1==short2); 
		
		Character char2 = Character.valueOf((char)127);
		Character char3 = Character.valueOf((char)127);
		
		System.out.println(char2==char3); 

		
	}

}
