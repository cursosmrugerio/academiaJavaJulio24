package com.curso.v6;

import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		
		s.findAny().ifPresent(t -> System.out.println(t)); // monkey 
		
		infinite.findAny().ifPresent(t -> System.out.println(t)); // chimp
	}

}
