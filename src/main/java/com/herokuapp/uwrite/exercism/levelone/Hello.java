package com.herokuapp.uwrite.exercism.levelone;

import static com.herokuapp.uwrite.exercism.levelone.Acronym.patternFromFront;
import static com.herokuapp.uwrite.util.data.text.RandomText.wordRepetition;
import static java.lang.System.*;
import static com.herokuapp.uwrite.errordetector.ErrorHandler.*;

public class Hello {

    private static Hello HELLO_INSTANCE = new Hello();

    public static Hello instance(){
        return HELLO_INSTANCE;
    }

    public String sayHelloWorld(final String INPUT){
        return isNullOrEmpty(INPUT);
    }

    public static void main(String[] args) {

        final String TEST = "My name is AMUDA Adeolu Badmus";


        out.println(
                instance().sayHelloWorld(TEST)
        );
    }

}
