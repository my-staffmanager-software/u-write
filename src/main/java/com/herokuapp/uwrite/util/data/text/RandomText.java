package com.herokuapp.uwrite.util.data.text;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

public class RandomText {

    public static String[] alphabets= {
            "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q"
            ,"R","S","T","U","V","W","X","Y","Z"
    };
    private static SecureRandom secureRandom = new SecureRandom();

    public RandomText(){}

    private static String randomWord(final int size){

        int[] index = new int[size];
        StringBuilder word = new StringBuilder();

        IntStream.range(0, index.length).forEachOrdered(c -> {
            index[c] = size + secureRandom.nextInt(alphabets.length - size);
            word.append(alphabets[index[c]]);
        });
        return word.toString();
    }

    public static String wordRepetition(final int HOW_MANY_WORDS, final int HOW_MANY_LETTER_WORDS_EACH){

        String[] output = new String[HOW_MANY_WORDS];
        StringBuilder result = new StringBuilder();

        Arrays.setAll(output, c -> randomWord(HOW_MANY_LETTER_WORDS_EACH));
        Arrays.stream(output).forEachOrdered(finalOutputs -> result.append(finalOutputs).append(" "));

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(
                wordRepetition(4,7).trim()
        );
    }

}
