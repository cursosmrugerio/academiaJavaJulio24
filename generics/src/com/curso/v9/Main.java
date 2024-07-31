package com.curso.v9;

//Definimos una excepción genérica personalizada
class CustomException extends Exception {
 public CustomException(String message) {
     super(message);
 }
}

//Creamos una clase genérica que puede lanzar esa excepción
class GenericClass<T> {
 private T value;

 public GenericClass(T value) {
     this.value = value;
 }

 public T getValue() throws CustomException {
     if (value == null) {
         throw new CustomException("Valor nulo no permitido");
     }
     return value;
 }

 public void setValue(T value) {
     this.value = value;
 }
}

//Clase principal para demostrar el uso de la clase genérica con excepciones
public class Main {
 public static void main(String[] args) {
     // Ejemplo con un valor no nulo
     try {
         GenericClass<String> genericString = new GenericClass<>("Hola, mundo");
         System.out.println("Valor: " + genericString.getValue());
     } catch (CustomException e) {
         System.err.println("Excepción atrapada $$$: " + e.getMessage());
     }

     // Ejemplo con un valor nulo
     try {
         GenericClass<String> genericNull = new GenericClass<>(null);
         System.out.println("Valor: " + genericNull.getValue());
     } catch (CustomException e) {
         System.err.println("Excepción atrapada: *** " + e.getMessage());
     }
 }
}

