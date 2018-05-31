package com.herokuapp.uwrite.exercism.levelone;

import static java.lang.System.*;

public class SpaceAge {


    public static String calculation(final int ageInSeconds, final String WHAT_SPACE){

        double result = 0;

        String output = "";

        for(Space space : Space.values()) {

            if (!WHAT_SPACE.equalsIgnoreCase(space.getName())) {
                output = WHAT_SPACE + " is invalid output , please user any of the following "+Space.values();
            }
            else
                if( WHAT_SPACE.equalsIgnoreCase(Space.Earth.getName()) ){
                result = ageInSeconds / Space.Earth.getSec() ;
            }
            else{
                    result = ageInSeconds / space.getYear();
                }
        }

        output = "Answer = "+result + " "+WHAT_SPACE+" year old";
        out.println("Age input = "+ageInSeconds+", input planet = "+WHAT_SPACE);
        out.println(output);

        return output;
    }

    public static void main(String[] args) {
        calculation(1000000000,"Venus");
    }

}
