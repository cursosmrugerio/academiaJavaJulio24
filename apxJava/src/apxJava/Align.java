package apxJava;

import java.text.*;

public class Align {
	
	public static void main(String[] args) throws ParseException {
		String[] sa = {"111.234","222.5678"};
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(3); //NO APLICA
		for (String s:sa)
			System.out.println(nf.parse(s));
		
		//111.234
		//222.5678

		System.out.println("***********");
		Double[] sa1 = {111.234,222.5678};
		NumberFormat nf1 = NumberFormat.getInstance();
		nf1.setMaximumFractionDigits(3); 
		for (Double s:sa1)
			System.out.println(nf1.format(s));
		
	}

}
