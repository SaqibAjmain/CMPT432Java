package com.company;
import java.util.regex.*;

public class Token {
    private String type;
    private String val;
    private int line;
    private int charAt;

    //https://stackoverflow.com/questions/17848207/making-a-lexical-analyzer
    //this is where I got my token class idea from with a few modifications

    public Token(String type, String val, int line, int charAt){
        this.type = findType(String type, String val);
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

    public String LexOut(){
        return ("DEBUG Lexer - " + getType() + "[ " + getVal() + " ]" + " found at (" + getLine() + ":" + getCharAt() + ")")
    }

    public String findType(String type, String val){

        String statementKW = "(print)|(while)|(if)";
        String boolKW = "(true)|(false)";
        String typeKW = "(int)|(string)|(boolean)";
        String charID = "[a-z]";
        String digit = "[0-9]";
        String symbolList = "[{}()=!+$]";



        return type;
    }
}
