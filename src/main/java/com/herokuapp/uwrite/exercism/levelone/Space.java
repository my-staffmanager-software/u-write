package com.herokuapp.uwrite.exercism.levelone;

public enum Space {

    Earth("Earth",1,0,365.25,31557600,0),
    Mercury("Mecury",0.2408467,0,0,0,0),
    Venus("Venus",0.61519726,0,0,0,0),
    Mars("Mars",1.8808158,0,0,0,0),
    Jupiter("Jupiter",11.862615,0,0,0,0),
    Saturn("Saturn",29.447498,0,0,0,0),
    Uranus("Uranus",84.016846,0,0,0,0),
    Neptune("Earth",164.79132,0,0,31557600,0);
    private final String name;
    private final double year, month, days, sec, min;

    Space(final String name, double y, double m, double d, double s, double minutes){
        this.name = name;
        this.year = y;
        this.month = m;
        this.days = d;
        this.sec  = s;
        this.min = minutes;
    }

    public double getMonth() {
        return month;
    }

    public double getSec() {
        return sec;
    }

    public double getYear() {
        return year;
    }

    public double getMin() {
        return min;
    }

    public double getDays() {
        return days;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Name = "+this.name + ", Year ~ "+this.year;
    }
}
