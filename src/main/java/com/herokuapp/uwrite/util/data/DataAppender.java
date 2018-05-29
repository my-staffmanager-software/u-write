package com.herokuapp.uwrite.util.data;

public final class DataAppender {

    private static DataAppender DATA_APPENDER_INSTANCE = new DataAppender();

    public static DataAppender instance() {
        return DATA_APPENDER_INSTANCE;
    }

    public static StringBuilder STRING_BUILDER_INSTANCE(){
        return new StringBuilder();
    }
}
