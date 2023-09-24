package com.uc.interface_example.example;

public class TextUtil implements StringUtil{
    private final String value;

    public TextUtil(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public TextUtil deleteChar(int i) {
        return new TextUtil(new StringBuilder(this.value).deleteCharAt(i).toString());
    }
}
