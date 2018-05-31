package com.herokuapp.uwrite.exercism.levelone;

import java.util.ArrayList;
import java.util.List;

import static com.herokuapp.uwrite.exercism.levelone.Acronym.patternFromFront;
import static com.herokuapp.uwrite.exercism.levelone.ArmstrongNumber.determiner;
import static com.herokuapp.uwrite.exercism.levelone.Gigasecond.forEachLifeSpan;
import static com.herokuapp.uwrite.exercism.levelone.Hello.instance;
import static com.herokuapp.uwrite.exercism.levelone.StringReversal.reverse;
import static com.herokuapp.uwrite.exercism.levelone.TwoFer.forYouOrMe;
import static com.herokuapp.uwrite.util.data.text.RandomText.wordRepetition;
import static java.lang.System.*;

public class Hamming {

    public static List<String> DNA_COMPARATOR(final String FIRST_DNA, final String SECOND_DNA){

        String[] FIRST_DNA_CONTAINER = FIRST_DNA.toUpperCase().trim().split("");
        String[] SECOND_DNA_CONTAINER = SECOND_DNA.toUpperCase().trim().split("");

        final int DATA_SIZE = FIRST_DNA_CONTAINER.length;
        final int STARING_POINT = 0;

        List<String> output = new ArrayList<>();

        if(FIRST_DNA_CONTAINER.length != SECOND_DNA_CONTAINER.length){

            output.add("IndexOutOfBoundsException for data size not the same for comparism "
            +" FIRST DNA "+FIRST_DNA +" SIZE = "+FIRST_DNA_CONTAINER.length+"\n"
            +" SECOND DNA "+SECOND_DNA +" SIZE = "+SECOND_DNA_CONTAINER.length+"\n"
            );

            out.println(output);
            throw new IndexOutOfBoundsException();
        }
        else{

            output.clear();
            for( int index = STARING_POINT; index < DATA_SIZE; index++){

                if( !FIRST_DNA_CONTAINER[index].equals(SECOND_DNA_CONTAINER[index]) )
                    output.add("^");

            }
        }
        out.println("Input       : "+ FIRST_DNA +", "+SECOND_DNA);
        out.println("Output      : "+output);
        out.println("Output size : "+output.size());
        return output;
    }

    public static void main(String[] args) {

        DNA_COMPARATOR("AGCTTACTAACGGGAT","CATCGTAATGACGGCCT");

    }

}
