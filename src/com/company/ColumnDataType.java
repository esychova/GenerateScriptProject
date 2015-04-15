package com.company;

import java.lang.reflect.Type;

public enum ColumnDataType {

    NUMBER_38,
    NUMBER_5,
    DATE,
    DATE_TIME,
    STRING;

    @Override
    public String toString() {
        return super.toString();
    }
    public String getColumnDataType(ColumnDataType dataType)   {
        switch (dataType)   {
            case NUMBER_38: return "NUMBER(38)";
            case NUMBER_5: return "NUMBER(5)";
            case DATE: return "DATE";
            case DATE_TIME: return "DATETIME";
            case STRING: return "STRING";
            default: throw new IllegalArgumentException("Unknown data type" + dataType);
        }
    }


}
