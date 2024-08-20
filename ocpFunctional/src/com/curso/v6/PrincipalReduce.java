package com.curso.v6;

import java.util.stream.Stream;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;


public class PrincipalReduce {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("w", "o", "l", "f");

		//BiFunction<String,String,String> bif = (s,c) -> s + c;
		BinaryOperator<String> bo = (s,c) -> s +c;
		
		String word = stream.reduce("", bo); 
		System.out.println(word);
		
		System.out.println("***********");
		
		Stream<String> streamOther = Stream.of("w", "o", "l", "f");
		
		//                 reduce("", String::concat);
		word = streamOther.reduce("", (s,c) -> s.concat(c)); 
		System.out.println(word); // wolf
		
		System.out.println("***********");
		
		Stream<Integer> streamInt = Stream.of(3, 5, 6);

		System.out.println(streamInt.reduce(1, (a, b) -> a*b));
		
		System.out.println("***********");
		
		BinaryOperator<Integer> op = (a, b) -> a * b;

		Stream<Integer> empty = Stream.empty();

		Stream<Integer> oneElement = Stream.of(3); 
		
		Stream<Integer> threeElements = Stream.of(3, 5, 6);

		System.out.println("empty.reduce(op).ifPresent(t -> System.out.println(t));");
		empty.reduce(op).ifPresent(t -> System.out.println(t)); // no output 
		oneElement.reduce(op).ifPresent(t -> System.out.println(t)); // 3 
		threeElements.reduce(op).ifPresent(t -> System.out.println(t)); // 90

		System.out.println("***********");

		BinaryOperator<Integer> op1 = (a, b) -> a * b;

		Stream<Integer> stream3V = Stream.of(3, 5, 6);

		System.out.println(stream3V.reduce(1, op1, op1)); // 90
		
		System.out.println("***********");

		Stream<String> stream2 = Stream.of("w", "o", "l", "f");

		StringBuilder word2 = stream2.collect(
				() -> new StringBuilder(), 
				(x,z) -> x.append(z), 
				(x,z) -> x.append(z));
		
		System.out.println(word2);
		
		System.out.println("***********");

		
		

		
	}

}
