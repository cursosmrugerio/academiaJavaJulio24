package com.curso.v6;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrincipalCollector {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("w", "o", "l", "f", "w");

		TreeSet<String> set = 
				stream.collect(
						() -> new TreeSet<String>(), 
						(t,u) -> t.add(u), 
						(x,y) -> x.addAll(y)); 
		
		System.out.println(set); // [f, l, o, w]
		
		System.out.println("***************");
		
		Stream<String> stream2 = Stream.of("w", "o", "l", "f");

		TreeSet<String> set2 = 
				stream2.collect(
					Collectors.toCollection(()-> new TreeSet<String>()));
		
		System.out.println(set); // [f, l, o, w]
		
		System.out.println("***************");

		Stream<String> stream3 = Stream.of("w", "o", "l", "f");

		Set<String> set3 = stream3.collect(Collectors.toSet()); 
		
		System.out.println(set3); // [f, w, l, o]

	}

}
