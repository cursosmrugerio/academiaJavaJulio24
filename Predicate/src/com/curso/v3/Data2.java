package com.curso.v3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Data2 {
	
	int value;
	
	Data2(int value){
		this.value = value;
	}

	@Override
	public String toString() {
		return ""+value;
	}

	public static void main(String[] args) {

		ArrayList<Data2> al = new ArrayList<>();
		
		Data2 d =  new Data2(1);
		al.add(d);
		
		d =  new Data2(2);
		al.add(d);
		
		d =  new Data2(3);
		al.add(d);
		
		System.out.println("Data2");
		System.out.println(al);
		
		Predicado<Data2> predicado =  z -> z.value == 2;
		
		new Data2(999).filterData(al,predicado);
		
		System.out.println(al);

		
	}
	
	public void filterData(ArrayList<Data2> dataList, Predicado<Data2> p) {
		Iterator<Data2> i = dataList.iterator();
		
		while( i.hasNext() ){
			if (p.probar(i.next())) {
				i.remove();
			}
		}
	}

}
