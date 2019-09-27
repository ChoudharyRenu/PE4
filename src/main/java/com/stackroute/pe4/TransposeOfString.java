package com.stackroute.pe4;

import java.util.Scanner;

public class TransposeOfString {
    private String s;

    public TransposeOfString(String s) {
        this.s = s;
    }

    public void transpose() {
        String[] ArrOfStrings = s.split(" ");
        String[] result = new String[ArrOfStrings.length];
        for (int i = 0; i < ArrOfStrings.length; i++) {
            StringBuilder temp = new StringBuilder(ArrOfStrings[i]);
            result[i] = temp.reverse().toString();
        }

        for (int i = 0; i < ArrOfStrings.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = scanner.nextLine();
        TransposeOfString  obj = new TransposeOfString(s);
        obj.transpose();
    }
}