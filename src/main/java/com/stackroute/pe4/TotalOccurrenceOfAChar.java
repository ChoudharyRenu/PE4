package com.stackroute.pe4;
import java.lang.String;
import java.util.Scanner;

public class TotalOccurrenceOfAChar {
    private String s;
    public TotalOccurrenceOfAChar(String s) {
        this.s = s;
    }
    public void occurrenceOfAChar(){
        String ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character to count the :");
        ch = scanner.next();
        int l1=s.length();
        if(s.contains(ch)){
            s=s.replace(ch,"");
        }
        int l2 = s.length();
        int num=l1-l2;
        System.out.println(ch+ " occurrs "+ num+"  times.");
    }
    public static void main(String[] args){
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TotalOccurrenceOfAChar obj= new TotalOccurrenceOfAChar(s);
        obj.occurrenceOfAChar();
    }

}
