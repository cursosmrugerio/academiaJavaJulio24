package com.curso.v6;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		List<Object> listaObject = new ArrayList<>();
		listaObject.add(new Object());
		listaObject.add("String "+"World");
		listaObject.add(new Triangulo(0.0));
		
		imprimirObjetos(listaObject);
		imprimirObjetosUnbounded(listaObject);
		//imprimirObjetosUpperbounded(listaObject); //NO SE PUEDE
		imprimirObjetosLowerbounded(listaObject);
		
		List<String> listaString = new ArrayList<>();
		listaString.add("String "+"Hello");
		listaString.add("String "+"World");
		
		//imprimirObjetos(listaString); //NO SE PUEDE
		imprimirObjetosUnbounded(listaString);
		//imprimirObjetosUpperbounded(listaString);
		//imprimirObjetosLowerbounded(listaString); //NO SE PUEDE

		List<Circulo> listaCirculo = new ArrayList<>();
		listaCirculo.add(new Circulo(1.0));
		listaCirculo.add(new Circulo(1.0));
		
		//imprimirObjetos(listaCirculo); //NO SE PUEDE
		imprimirObjetosUnbounded(listaCirculo);
		imprimirObjetosUpperbounded(listaCirculo);
		//imprimirObjetosLowerbounded(listaCirculo); //NO SE PUEDE

		List<Cuadrado> listaCuadrado = new ArrayList<>();
		listaCuadrado.add(new Cuadrado(2.0));
		listaCuadrado.add(new Cuadrado(2.0));

		//imprimirObjetos(listaCuadrado); //NO SE PUEDE
		imprimirObjetosUnbounded(listaCuadrado);
		imprimirObjetosUpperbounded(listaCuadrado);
		//imprimirObjetosLowerbounded(listaCuadrado); //NO SE PUEDE

		List<Triangulo> listaTriangulo = new ArrayList<>();
		listaTriangulo.add(new Triangulo(3.0));
		listaTriangulo.add(new Triangulo(3.0));

		//imprimirObjetos(listaTriangulo); //NO SE PUEDE
		imprimirObjetosUnbounded(listaTriangulo);
		imprimirObjetosUpperbounded(listaTriangulo);
		//imprimirObjetosLowerbounded(listaTriangulo); //NO SE PUEDE

		List<Figura> listaFigura = new ArrayList<>();
		listaFigura.add(new Circulo(4.0));
		listaFigura.add(new Cuadrado(4.0));
		listaFigura.add(new Triangulo(4.0));
		
		//imprimirObjetos(listaFigura); //NO SE PUEDE
		imprimirObjetosUnbounded(listaFigura);
		imprimirObjetosUpperbounded(listaFigura);
		imprimirObjetosLowerbounded(listaFigura);

	}
	
	static void imprimirObjetos(List<Object> lista) {
		lista.add(new Circulo(4.0));
		lista.add(new Integer(3));
		
		for(Object o:lista)
			System.out.println(o);
	}
	
	static void imprimirObjetosUnbounded(List<?> lista) {
		//lista.add(new Circulo(4.0)); //NO SE PUEDE
		//lista.add(new Integer(3)); //NO SE PUEDE
		
		for(Object o:lista)
			System.out.println(o);
	}
	
	static void imprimirObjetosUpperbounded(List<? extends Figura> lista) {
		//lista.add(new Figura(4.0)); //NO SE PUEDE
		
		for(Figura o:lista)
			System.out.println(o);
	}
	
	static void imprimirObjetosLowerbounded(List<? super Figura> lista) {
		lista.add(new Figura(5.0)); //SI SE PUEDE
		lista.add(new Circulo(5.0));
		lista.add(new Triangulo(5.0));
		
		for(Object o:lista)
			System.out.println(o);
	}

}

class Figura{
	private double area;
	public Figura(double area) {
		this.area = area;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+
				" [area=" + area + "]";
	}
}
class Circulo extends Figura{
	public Circulo(double area) {
		super(area);
	}
}
class Cuadrado extends Figura{
	public Cuadrado(double area) {
		super(area);
	}
}
class Triangulo extends Figura{
	public Triangulo(double area) {
		super(area);
	}
}
