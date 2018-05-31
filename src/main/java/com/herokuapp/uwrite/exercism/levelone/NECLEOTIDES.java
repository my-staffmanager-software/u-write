package com.herokuapp.uwrite.exercism.levelone;

import java.util.Arrays;

public enum NECLEOTIDES {

    DNA("DNA", RnaTranscription.DNA),
    RNA("RNA",RnaTranscription.RNA);

    private final String NAME;
    private String[] COMPISITION = new String[4];

    NECLEOTIDES(final String name, final String [] constituents ){
        this.NAME = name;
        this.COMPISITION = constituents;
    }


}
