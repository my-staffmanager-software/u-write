package com.herokuapp.uwrite.util.mth;
import static java.lang.System.*;

public final class BasicMath {

    /**
     * This method <a>raiseToPower</a> works perfectly for int data
     * wrong answers with floating or double data type
     *
     *
     * */

    public static double raiseToPower(final double source, final double power){

        final int ROOT_INDEX = 1;

        int howManyTimes = ROOT_INDEX;
        double output = ROOT_INDEX;

        do{
            output = output * source;
            ++howManyTimes;
        }while(howManyTimes <= (int)power );

        out.println("Raise to power calculation for {Source = "+source +", power = "+power+"}");
        out.println(source+ " ^ "+power+"\n\t  =  "+output);
        out.println();

        return  output;
    }

    public static double isArmstrongNumberOrNot(final double input){

       final String INPUT_CONVERTED_TO_STRING = String.valueOf( (int) input);
       String[] SPLITTED_INPUT = INPUT_CONVERTED_TO_STRING.split("");

       double answer = 0;

       final int DATA_LENGTH = SPLITTED_INPUT.length;

        for(int index = 0; index < DATA_LENGTH; index++){
            answer = answer + raiseToPower( Double.valueOf(SPLITTED_INPUT[index]), DATA_LENGTH );
        }

        out.println("Armstrong determiner for "+input);
        out.println("Input  : "+input);
        out.println("Output : "+answer);
        out.println();

        return (int)answer;

    }

    public static void main(String[] args) {

        //raiseToPower(4,4);

        isArmstrongNumberOrNot(10);

    }
}
