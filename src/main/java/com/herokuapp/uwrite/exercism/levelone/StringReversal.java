package com.herokuapp.uwrite.exercism.levelone;

import com.herokuapp.uwrite.errordetector.ErrorHandler;
import static com.herokuapp.uwrite.util.data.DataAppender.*;
import static java.lang.System.*;


public final class StringReversal {

    private static StringReversal STRING_REVERSAL_INSTANCE = new StringReversal();

    public static StringReversal instance(){
        return STRING_REVERSAL_INSTANCE;
    }

    public static String reverse(final String input){

        String[] splited_input = ErrorHandler.isNullOrEmpty(input).split("");

        StringBuilder output = STRING_BUILDER_INSTANCE();

        final int DATA_SIZE = splited_input.length - 1;

        for(int index = DATA_SIZE; index >= 0; index--)
            output.append(splited_input[index]);

        out.println("String reversal...");
        out.println("Input  : "+input);
        out.println("Output : "+output);
        out.println();

        return output.toString();

    }

    public static void main(String[] args) {

        instance().reverse("write");
        instance().reverse("read");
        instance().reverse("cool");
        instance().reverse("");
        instance().reverse(null);
        instance().reverse("badmus");
        instance().reverse("adeolu");
        instance().reverse("amuda");
        instance().reverse("abcdefghijklmnopqrstuvwxyz");
        instance().reverse("zyxwvutsrqponmlkjihgfedcba");
        instance().reverse("0123456789");
        instance().reverse("9876543210");

    }

}
