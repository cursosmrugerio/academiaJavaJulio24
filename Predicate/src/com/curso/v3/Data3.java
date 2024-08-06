package com.curso.v3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Data3 {
	
	int value;
	
	Data3(int value){
		this.value = value;
	}

	@Override
	public String toString() {
		return ""+value;
	}

	public static void main(String[] args) {

		ArrayList<Data3> al = new ArrayList<>();
		
		Data3 d =  new Data3(1);
		al.add(d);
		
		d =  new Data3(2);
		al.add(d);
		
		d =  new Data3(3);
		al.add(d);
		
		System.out.println("Data3");
		System.out.println(al);
		
		new Data3(999).filterData(al,z -> z.value == 2);
		
		System.out.println(al);

		
	}
	
	public void filterData(ArrayList<Data3> dataList, Predicado<Data3> p) {
		Iterator<Data3> i = dataList.iterator();
		
		while( i.hasNext() ){
			if (p.probar(i.next())) {
				i.remove();
			}
		}
	}

}
