package com.koala.infinitum.android_project.support;

public class DataParser {
    private DataParser(){};

    public static String parse(String data) {
        String result = "";
        result += data.substring(11, 19);
        result += " ";
        result += data.substring(0, 10);
        return result;
    }

    public static String parseToDB(String data){
        String result="";
        return result;
    }
}
