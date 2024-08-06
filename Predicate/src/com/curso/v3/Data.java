package com.curso.v3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Data {
	
	int value;
	
	Data(int value){
		this.value = value;
	}

	@Override
	public String toString() {
		return ""+value;
	}

	public static void main(String[] args) {

		ArrayList<Data> al = new ArrayList<>();
		
		Data d =  new Data(1);
		al.add(d);
		
		d =  new Data(2);
		al.add(d);
		
		d =  new Data(3);
		al.add(d);
		
		System.out.println("Data Predicate");

		System.out.println(al);
				
		new Data(999).filterData(al, (Data x) -> {return x.value%2 == 0;});
		
		System.out.println(al);
		
	}
	
	public void filterData(ArrayList<Data> dataList, Predicate<Data> p) {
		Iterator<Data> i = dataList.iterator();
		
		while( i.hasNext() ){
			if (p.test(i.next())) {
				i.remove();
			}
		}
	}

}
