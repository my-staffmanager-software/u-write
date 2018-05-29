package com.herokuapp.uwrite.exercism.levelone;
import com.herokuapp.uwrite.singleton.SingletonObject;

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

        System.out.println(
                instance().sayHelloWorld(TEST)
        );
    }

}
