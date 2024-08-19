package com.curso.v5;

import java.util.Optional;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		Stream<String> ss1 = Stream.of("monkey", "gorilla", "bonobo");
		System.out.println(ss1.count());
		
		Stream<String> ss2 = Stream.of("monkey", "gorilla", "bonobo", "aguila");
		System.out.println(ss2.filter(x -> x.endsWith("a")).count());
		
		Stream<String> s = Stream.of("monkey", "ape", "pa" ,"bonobo");
		Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
		
		min.ifPresent(t -> System.out.print("Data: "+t));
		
		
		
	}

}
