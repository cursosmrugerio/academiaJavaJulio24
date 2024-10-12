package com.curso.v0;

class ClassA {}

class ClassB extends ClassA {}

class ClassC extends ClassA {}

public class Test {
    public static void main(String[] args) {
        ClassA p0 = new ClassA();  // p0 es de tipo ClassA
        ClassB p1 = new ClassB();  // p1 es de tipo ClassB
        ClassC p2 = new ClassC();  // p2 es de tipo ClassC
        ClassA p3 = new ClassB();  // p3 es de tipo ClassA, pero instancia de ClassB
        ClassA p4 = new ClassC();  // p4 es de tipo ClassA, pero instancia de ClassC

        // Valid statements
        
        // ClassA p0 = new ClassB();
        p0 = p1;                 // Válido: p0 (ClassA) puede referirse a p1 (ClassB) porque ClassB es una subclase de ClassA.
        
        // ClassB p1 = new ClassB();
        p1 = (ClassB) p3;        // Válido: p3 es de tipo ClassA, pero contiene una instancia de ClassB. Necesita conversión explícita.
        
        // ClassC p2 = new ClassC();
        p2 = (ClassC) p4;        // Válido: p4 es de tipo ClassA, pero contiene una instancia de ClassC. Necesita conversión explícita.
    
        // ClassB p1 = new ClassC();
        // p1 = p2;
        
        // ClassC p2 = new ClassC();
        // p2 = p4; FALTA EL CAST
        
        //ClassC p2 = new ClassB();
        //p2 = (ClassC)p1;
    
    }
}
