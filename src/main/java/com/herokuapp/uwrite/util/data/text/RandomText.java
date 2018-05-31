package com.herokuapp.uwrite.util.data.text;

import java.security.SecureRandom;

public class RandomText {

    private static String[] alphabets= {
            "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q"
            ,"R","S","T","U","V","W","X","Y","Z"
    };
    private static SecureRandom secureRandom = new SecureRandom();

    public RandomText(){}

    private static String randomWord(final int size){

        int[] index = new int[size];
        StringBuilder word = new StringBuilder();

        for( int c = 0; c < index.length; c++){
            index[c] = size + secureRandom.nextInt(alphabets.length - size);
            word.append(alphabets[index[c]]);
        }
        return word.toString();
    }

    public static String wordRepetition(final int HOW_MANY_WORDS, final int HOW_MANY_LETTER_WORDS_EACH){

        String[] output = new String[HOW_MANY_WORDS];

        for( int c = 0; c < output.length; c++){
            output[c] = randomWord(HOW_MANY_LETTER_WORDS_EACH);
        }

        StringBuilder result = new StringBuilder();

        for(String finalOutputs : output)
            result.append(finalOutputs).append(" ");

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(
                wordRepetition(4,7).trim()
        );
    }

}
