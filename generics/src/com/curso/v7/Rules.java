package com.curso.v7;
import java.util.ArrayList;
import java.util.List;

public class Rules {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10); //AUTOBOXING
        int number = integers.get(0); //UNBOXING

        List<String> languages = new ArrayList<>();
        languages.add("English");
        
        //integers = languages;
    }
}

