package com.curso.v3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Data1 {
	
	int value;
	
	Data1(int value){
		this.value = value;
	}

	@Override
	public String toString() {
		return ""+value;
	}

	public static void main(String[] args) {

		ArrayList<Data1> al = new ArrayList<>();
		
		Data1 d =  new Data1(1);
		al.add(d);
		
		d =  new Data1(2);
		al.add(d);
		
		d =  new Data1(3);
		al.add(d);
		
		System.out.println("Data1");
		System.out.println(al);
		
		Predicado<Data1> predicado = new Predicado<>() {
			@Override
			public boolean probar(Data1 data) {
				return data.value == 2;
			}
		};
		
		new Data1(999).filterData(al,predicado);
		
		System.out.println(al);

		
	}
	
	public void filterData(ArrayList<Data1> dataList, Predicado<Data1> p) {
		Iterator<Data1> i = dataList.iterator();
		
		while( i.hasNext() ){
			if (p.probar(i.next())) {
				i.remove();
			}
		}
	}

}
