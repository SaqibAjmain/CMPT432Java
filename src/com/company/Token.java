package com.company;
import java.util.regex.*;

public class Token {
    private String type;
    private String val;
    private int line;
    private int charAt;

    public Token(String type, String val, int line, int charAt){
        this.type = type;
        this.val = val;
        this.line = line;
        this.charAt = charAt;
    }

    public String getType() {
        return type;
    }

    public String getVal() {
        return val;
    }

    public int getLine() {
        return line;
    }

    public int getCharAt(){
        return charAt;
    }

    public String LexMessage(){
        return ("DEBUG Lexer - " + getType() + "[ " + getVal() + " ]" + " found at (" + getLine() + ":" + getCharAt() + ")")
    }

    
}
