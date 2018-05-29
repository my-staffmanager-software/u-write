package com.herokuapp.uwrite.singleton;

public class SingletonObject<O> {

    private SingletonObject<O> objectInstance = new SingletonObject<>();

    public SingletonObject<O> getObjectInstance(){
        return objectInstance;
    }
}
