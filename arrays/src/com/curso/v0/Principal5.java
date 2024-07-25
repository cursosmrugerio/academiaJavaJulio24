package com.curso.v0;

import java.util.*;

public class Principal5 {

	public static void main(String[] args) {
		
		List<String> listaBancos = new ArrayList<>();
		
		listaBancos.add("BBVA");
		listaBancos.add("Coppel");

		System.out.println(listaBancos);
		
		listaBancos.remove(1);
		
		System.out.println(listaBancos);

		
		String[] arrayNombres = {"Patrobas","Andronico","Tercio"};
		
		List<String> listaNombres = Arrays.asList(arrayNombres);
		
		listaNombres.set(1, "Epeneto");
		listaNombres.add("Andronico");
		
		System.out.println(listaNombres);
		
		
		
		
		
		
		
		
		
	}

}
