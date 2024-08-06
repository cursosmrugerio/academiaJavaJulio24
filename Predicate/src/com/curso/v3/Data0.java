package com.curso.v3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Data0 {
	
	int value;
	
	Data0(int value){
		this.value = value;
	}

	@Override
	public String toString() {
		return ""+value;
	}

	public static void main(String[] args) {

		ArrayList<Data0> al = new ArrayList<>();
		
		Data0 d =  new Data0(1);
		al.add(d);
		
		d =  new Data0(2);
		al.add(d);
		
		d =  new Data0(3);
		al.add(d);
		
		System.out.println(al);
		
		new Data0(999).filterData(al,new ImplementaPredicado());
		
		System.out.println(al);

		
	}
	
	public void filterData(ArrayList<Data0> dataList, Predicado<Data0> p) {
		Iterator<Data0> i = dataList.iterator();
		
		while( i.hasNext() ){
			if (p.probar(i.next())) {
				i.remove();
			}
		}
	}

}

class ImplementaPredicado implements Predicado<Data0>{

	@Override
	public boolean probar(Data0 data) {
		return data.value == 2;
	}
	
}
