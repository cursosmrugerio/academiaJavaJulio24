package com.curso.v7;

import java.util.Arrays;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Java Functional");
		
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo","mono");

		//s.forEach( r-> System.out.println(r) );
		
		s.filter(x -> x.startsWith("m")) //INTERMEDIO
		 .peek(r-> System.out.println(r)) //INTERMEDIO
		 .forEach(r-> System.out.println(r)); //FINAL
		
//		s.filter(x -> x.startsWith("m")) //INTERMEDIO
//		 .peek(r-> System.out.println(r)); //INTERMEDIO
		System.out.println("***********");
		String[] arreglo = {"duck", "duck", "duck", "goose"};
		Stream<String> s1 = Arrays.stream(arreglo);
		s1.distinct()
		  .forEach((t)->System.out.println(t)); // duckgoose
		
		System.out.println("***********");

		Stream<Integer> s2 = Stream.iterate(1, n -> n + 1); 
		s2.skip(10)
		  .limit(5)
		  .forEach((t)->System.out.println(t));

		System.out.println("***********");

		Stream<String> s3 = Stream.of("monkey", "gorilla", "bonobo");
		s3.map(t -> t.length())
		  .forEach(t->System.out.println(t));
		
	}

}
