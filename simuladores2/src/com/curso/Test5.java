package com.curso;

public class Test5 {
	public static void main(String args[]) {
		Side primerIntento = new Head();
		Tail segundoIntento = new Tail();
		Object tercerIntento = new Head();
		Coin.overload(primerIntento);
		Coin.overload((Object)segundoIntento);
		Coin.overload(segundoIntento);
		//Coin.overload((Tail)primerIntento); ClassCastException
		Coin.overload((Side)tercerIntento);
		
		System.out.println("*********");
		
		Side side01 = new OtherTail();
		
	}
}

interface Side {
	String getSide();
}

class Head implements Side {
	public String getSide() {
		return "Head ";
	}
}

class Tail implements Side {
	public String getSide() {
		return "Tail ";
	}
}

class OtherTail extends Tail  {
	public String getSide() {
		return "OtherTail ";
	}
}

class Coin {
	public static void overload(Head side) {
		System.out.println(side.getSide());
	}

	public static void overload(Tail side) {
		System.out.println(side.getSide());
	}

	public static void overload(Side side) {
		System.out.println("Side ");
	}

	public static void overload(Object side) {
		System.out.println("Object ");
	}
}