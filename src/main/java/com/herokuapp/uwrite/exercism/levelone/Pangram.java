package com.herokuapp.uwrite.exercism.levelone;

import java.util.Random;

public class Pangram {

    public static String isASCII(final String INPUT){

        String response = "NOT";

        if( INPUT.matches("[0-9]{1,}"))
            response = "NOT";

        return "This is "+response+" a pangram sentence";
    }

    public static void main(String[] args) {

        System.out.println(

                isASCII("hello world klepow ")

        );

    }
}
