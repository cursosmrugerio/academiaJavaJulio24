package com.curso;

interface Rideable {
	String getTicket(); 
}


public class Camel implements Rideable {

	@Override
	public String getTicket() {
		return "Hello";
	}

	int weight = 2;
	
	String getGait() {
		return getTicket() + ", lope";
	}
	
	void go(int speed) {
		++speed; //9
		weight++; //3
		int walkrate = speed * weight; //27
		System.out.print(walkrate + getGait()); // 27 Hello, lope 
	}
	public static void main(String[] args) {
		new Camel().go(8);
	}

	

}
