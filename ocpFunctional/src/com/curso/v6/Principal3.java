package com.curso.v6;

import java.util.stream.Stream;
import java.util.*;
import java.util.function.Predicate;

public class Principal3 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("monkey", "2", "chimp"); 
		Stream<String> streamLista = list.stream();
		Stream<String> streamLista2 = list.stream();
		
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0)); 
		
		System.out.println(streamLista.anyMatch(pred)); // true 
		System.out.println(streamLista2.allMatch(pred)); // false System.out.println(list.stream().noneMatch(pred)); // false System.out.println(infinite.anyMatch(pred)); // true
	}

}
