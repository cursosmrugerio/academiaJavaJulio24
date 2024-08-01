package com.curso.v10;

class Parent {
//    void display(int num) {
//        System.out.println("int: " + num);
//    }
    
    void display(int[] num) {
        System.out.println("int[]: " + num);
    }

//    void display(Integer num) {
//        System.out.println("Integer: " + num);
//    }
    
//    void display(Number num) {
//        System.out.println("Number: " + num);
//    }
    
    void display(Object num) {
        System.out.println("Object: " + num);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.display(555555555); 
        obj.display(99999999999L); //Number 
        
        
    }
}
