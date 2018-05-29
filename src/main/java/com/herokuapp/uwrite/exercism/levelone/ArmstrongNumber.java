package com.herokuapp.uwrite.exercism.levelone;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;
import static com.herokuapp.uwrite.util.mth.BasicMath.*;

public class ArmstrongNumber {

    /**Following is an Armstrong number from 0 - 20,000,000
     *
     [0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0,
     153.0, 370.0, 371.0, 407.0, 1634.0, 8208.0,
     9474.0, 54748.0, 92727.0, 93084.0, 548834.0, 1741725.0,
     4210818.0, 9800817.0, 9926315.0]
     * */

    public static String determiner(final double input){

        String isOrNot = "not";
        final double result = isArmstrongNumberOrNot(input);

        if(result == input )
            isOrNot = "";

        String output = "{input = "+input+" is "+isOrNot+" an Armstrong number."+" output = " +result+"}";
        out.println(output);

        return output;
    }

    public static void main(String[] args) {

        determiner(9926315);
        determiner(4210818);
        determiner(370);
        determiner(407);
        determiner(1634);
        determiner(548834);

    }

}
