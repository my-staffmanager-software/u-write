package com.herokuapp.uwrite.exercism.levelone;

import static com.herokuapp.uwrite.util.data.text.RandomText.wordRepetition;

import static java.lang.System.*;

public class Acronym {

    /**
     *Get word acronym example (Amuda Adeolu Badmus) {AAB}
     @Approach
     <li/> Split the text input with a single space bar into an arrays (" ")
     <li/> A character array to store each splitted input ( one character )
     <li/> Define a new variable to store all the processed initials
     <li> Loop through and store each initial into @code newInitials, assign to output variable</li>
     *REMARKS : Very efficient
     */

    public static String patternFromFront(String input){

        String[] newSplittedInput = input.split(" ");
        final int ROOT_INDEX = 1, STARING_POINT = 0;

        char[] newInitials = new char[ROOT_INDEX];
        String output = "";

        for(int index = STARING_POINT; index < newSplittedInput.length; index++){
            newSplittedInput[index].getChars(STARING_POINT,ROOT_INDEX, newInitials,STARING_POINT);
            output = output + String.valueOf(newInitials);
        }

        out.println("Input  : "+input);
        out.println("Output : "+output);

        return output.toUpperCase();
    }


    public static void main(String[] args) {

        final String test = wordRepetition(7,13);

        patternFromFront(test);

        patternFromFront("Portable Network Graphics");
    }

}
