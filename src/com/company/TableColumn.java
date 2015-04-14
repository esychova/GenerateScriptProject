package com.company;


public class TableColumn {

    private String name;
    private String dataType;
    private boolean isNullable;

    public TableColumn(String name, String dataType)    {
        this.name = name;
        this.dataType = dataType;
    }

    public TableColumn(String name, String dataType, boolean isNullable)    {
        this.name = name;
        this.dataType = dataType;
        this.isNullable = isNullable;
    }

    public String toScript()    {
        StringBuilder sb = new StringBuilder();
        sb.append(name.toUpperCase()).append(CharUtil.SPACE).
                append(dataType.toUpperCase()).append(CharUtil.SPACE);
        if(isNullable)
            sb.append(CharUtil.NOT_NULL);
        return sb.toString();
    }
}
