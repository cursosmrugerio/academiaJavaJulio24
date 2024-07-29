package apxJava;

public class Blip {
	protected int blipvert(int x) {
		return 0;
	}
}

class Vert extends Blip{
	
	//d)
	@Override
	protected int blipvert(int x) {
		return 5;
	}
	
	//a)
//	private int blipvert(long x) {
//		return 0;
//	}
	
	//a)
	protected int blipvert(long x) {
		return 0;
	}
	
	
	
	private int blipvert(String x) {
		return 0;
	}
}