package com.company;

import java.lang.reflect.Field;

public class TableGenerator {

    private String tableName;
    private Class cl;

    public TableGenerator(String className) {

        try {
            cl = Class.forName(className);
            String tokens [] = className.split("\\.");
            className = tokens[tokens.length -1];
            this.tableName = generateTableName(className);
            Field[] fields = cl.getDeclaredFields();
            for(Field field : fields)   {
                String st = field.getName();

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String generateTableName(String className)   {
        String[] words = className.split("(?<=.)(?=\\p{Upper})");
        StringBuilder sb = new StringBuilder();
        char word_delimiter = '_';
        for(String word : words)    {
            if(!CharUtil.IMPL_SUFFIX.equals(word))
              sb.append(word).append(word_delimiter);
        }
        return sb.toString();
    }
}
