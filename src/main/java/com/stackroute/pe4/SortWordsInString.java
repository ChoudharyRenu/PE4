package com.stackroute.pe4;

import java.util.Scanner;

public class SortWordsInString {
    private String s;

    public SortWordsInString(String s) {
        this.s = s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void sortWords(){
        String[] ArrOfStrings = s.split(" ");
        for (int i=0;i<ArrOfStrings.length;i++){
            if(ArrOfStrings[i].contains(".")){
                ArrOfStrings[i]=ArrOfStrings[i].replace(".","");
            }
            else if(ArrOfStrings[i].contains(",")){
                ArrOfStrings[i] =ArrOfStrings[i].replace(",","");
            }
        }

        String temp;
        for (int i = 0; i < ArrOfStrings.length; i++)
        {
            for (int j = i ; j < ArrOfStrings.length; j++) {
                if (ArrOfStrings[i].compareTo(ArrOfStrings[j])>0)
                {
                    temp = ArrOfStrings[i];
                    ArrOfStrings[i] = ArrOfStrings[j];
                    ArrOfStrings[j] = temp;
                }
            }
        }
        for (int i=0;i<ArrOfStrings.length;i++){
            System.out.println(ArrOfStrings[i]);
        }
    }

    public static void main(String[] args){
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string input of your choice:");
        s=scanner.nextLine();
        SortWordsInString obj = new SortWordsInString(s);
        obj.sortWords();

    }
}
