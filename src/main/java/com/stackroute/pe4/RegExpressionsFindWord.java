package com.stackroute.pe4;

import java.util.Scanner;

public class RegExpressionsFindWord {
    private String s;

    public RegExpressionsFindWord(String s) {
        this.s = s;
    }
    public void findWord(){
        if(s.toLowerCase().matches("^.*harry.*$")){
            System.out.println("Pattern matched");
        }
        else {
            System.out.println("could not find harry");
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        RegExpressionsFindWord obj= new RegExpressionsFindWord(s);
        obj.findWord();
    }
}
