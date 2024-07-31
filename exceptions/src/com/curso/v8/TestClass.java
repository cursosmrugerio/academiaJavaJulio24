package com.curso.v8;

public class TestClass{
    public static void main(String args[]){
        try{
            m1();
        }catch(IndexOutOfBoundsException e){
            System.out.println("1");
            try {
            	throw new NullPointerException();
            }catch(NullPointerException i){
            	System.out.println("1_A");
            }
       }catch(NullPointerException e){
            System.out.println("2");
            return;
        }catch(Exception e) {
            System.out.println("3");
        }finally{
            System.out.println("4");
        }
        System.out.println("END");
    }

    static void m1(){
        System.out.println("m1 Starts");
        throw new IndexOutOfBoundsException("Big Bang");
    }
}
