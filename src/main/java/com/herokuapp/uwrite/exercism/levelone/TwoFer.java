package com.herokuapp.uwrite.exercism.levelone;
import static java.lang.System.*;

public final class TwoFer {

    private static TwoFer TWO_FER_INSTANCE = new TwoFer();

    public static TwoFer instance(){
        return TWO_FER_INSTANCE;
    }

    public static String forYouOrMe(String SOURCE){

        String youOrMe = SOURCE;

        if( SOURCE == null || SOURCE.length() == 0)
            youOrMe = "you";

        youOrMe = "One for "+youOrMe+", One for me.";

        out.println("Input  : "+SOURCE);
        out.println("Output : "+youOrMe);

        return youOrMe;

    }

    public static void main(String[] args) {
        forYouOrMe("amuda");
        forYouOrMe(null);
        forYouOrMe("");
        forYouOrMe("me");
        forYouOrMe("you");
        forYouOrMe("one");
        forYouOrMe("for");



    }
}
