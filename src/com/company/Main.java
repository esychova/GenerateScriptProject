package com.company;

public class Main {

    public static void main(String[] args) {

        String classNameWithPath = args[0];
        String tokens [] =classNameWithPath.split("\\.");
        String className = tokens[tokens.length -1];

        TableGenerator tg = new TableGenerator(classNameWithPath);


    }



}
