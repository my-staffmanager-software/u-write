package com.herokuapp.uwrite.exercism.levelone;

import static com.herokuapp.uwrite.util.mth.BasicMath.raiseToPower;

import static java.lang.System.*;

public class Gigasecond {

    private static final int GIGA_CONVERSION = (int)raiseToPower(10,9);

    public static int forEachLifeSpan(int year){
        return GIGA_CONVERSION / year;
    }

    public static void main(String[] args) {
        System.out.println(
              forEachLifeSpan(23)
        );
    }

}
