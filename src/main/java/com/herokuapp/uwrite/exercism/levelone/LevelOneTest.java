package com.herokuapp.uwrite.exercism.levelone;

import static com.herokuapp.uwrite.exercism.levelone.Acronym.patternFromFront;
import static com.herokuapp.uwrite.exercism.levelone.ArmstrongNumber.determiner;
import static com.herokuapp.uwrite.exercism.levelone.Gigasecond.forEachLifeSpan;
import static com.herokuapp.uwrite.exercism.levelone.Hamming.DNA_COMPARATOR;
import static com.herokuapp.uwrite.exercism.levelone.Hello.instance;
import static com.herokuapp.uwrite.exercism.levelone.StringReversal.reverse;
import static com.herokuapp.uwrite.exercism.levelone.TwoFer.forYouOrMe;
import static com.herokuapp.uwrite.util.data.text.RandomText.wordRepetition;
import static java.lang.System.out;

public class LevelOneTest {

    public static void main(String[] args) {

        final String TEST = "My name is AMUDA Adeolu Badmus";
        out.println(
                instance().sayHelloWorld(TEST)
        );

        final String test = wordRepetition(7,13);
        patternFromFront(test);
        patternFromFront("Portable Network Graphics");

        determiner(9926315);
        determiner(4210818);
        determiner(370);
        determiner(407);
        determiner(1634);
        determiner(548834);

        System.out.println(
                forEachLifeSpan(23)
        );

        reverse("write");
        reverse("read");
        reverse("cool");
        reverse("");
        reverse(null);
        reverse("badmus");
        reverse("adeolu");
        reverse("amuda");
        reverse("abcdefghijklmnopqrstuvwxyz");
        reverse("zyxwvutsrqponmlkjihgfedcba");
        reverse("0123456789");
        reverse("9876543210");

        forYouOrMe("amuda");
        forYouOrMe(null);
        forYouOrMe("");
        forYouOrMe("me");
        forYouOrMe("you");
        forYouOrMe("one");
        forYouOrMe("for");



        DNA_COMPARATOR("AGCTATACTAACGGGAT","CATCGTAATGACGGCCT");


    }

}
