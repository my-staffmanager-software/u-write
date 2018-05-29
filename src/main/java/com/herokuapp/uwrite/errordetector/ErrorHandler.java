package com.herokuapp.uwrite.errordetector;
import java.io.Serializable;

public final class ErrorHandler implements Serializable {

    public static String isNullOrEmpty( final String input){
        String output = input;

        if( input == null || input.length() == 0) {
            output = "NO INPUT IS PROVIDED...PLEASE INPUT SOMETHING";
            System.err.println(output);
        }
        return output;
    }
}
