package com.company;


import java.lang.reflect.Type;

public class TableColumn {

    private String name;
    private Type dataType;
    private boolean isNullable;

    public TableColumn(String name, Type dataType)    {
        this.name = name;
        this.dataType = dataType;
    }

    public TableColumn(String name, Type dataType, boolean isNullable)    {
        this.name = name;
        this.dataType = dataType;
        this.isNullable = isNullable;
    }

    public String toScript()    {
        StringBuilder sb = new StringBuilder();
        sb.append(name.toUpperCase()).append(CharUtil.SPACE).
                append(dataType.toString().toUpperCase()).append(CharUtil.SPACE);
        if(isNullable)
            sb.append(CharUtil.NOT_NULL);
        return sb.toString();
    }
}
