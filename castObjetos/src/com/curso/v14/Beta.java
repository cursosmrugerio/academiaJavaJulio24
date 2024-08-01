package com.curso.v14;

class Baap{
	public int h = 4;
	
	public int getH() {
		System.out.println("Baap " + h);
		return h;
	}
}
//Beta 44
//4 44
//Beta 44
//44 44


public class Beta extends Baap{
	public int h = 44;
	
	@Override
	public int getH() {
		super.getH();
		//System.out.println("Beta " + h);
		return h;
	}
	public static void main(String[] args) {
		Baap b = new Beta();
		System.out.println(b.h + " " + b.getH());
		Beta bb = (Beta) b;
		System.out.println(bb.h + " " + bb.getH());
	}
}
