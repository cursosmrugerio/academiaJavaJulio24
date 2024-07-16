package com.curso.v0;

public class Multi {
	
	int x;
	int y;
	
	public Multi(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int ejecuta(){
		return x*y;
	}

	@Override
	public String toString() {
		return "Multi [x=" + x + ", y=" + y + "]";
	}
	
	

}
