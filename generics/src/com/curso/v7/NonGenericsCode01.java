package com.curso.v7;

import java.util.*;

public class NonGenericsCode01 {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        //languages.add(23);
        Object value = new String("Swedish");
        languages.add((String)value);
        processLanguages(languages);
    }

    private static void processLanguages(List<String> data){
        String language = data.get(0);
        System.out.println(language);
    }
}