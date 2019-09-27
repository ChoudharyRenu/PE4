package com.stackroute.pe4;

import java.util.Scanner;

public class FindWordInString {
    private String s;

    public FindWordInString(String s) {
        this.s = s;
    }
    public void findWord(){
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Enter the word that you want to search:");
        word = sc.next();
        String[] arr = s.split(" ");
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].contains(word)){
                count++;
            }
        }
        System.out.println(word+" occurrs "+ count +" times.");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = scanner.nextLine();
        FindWordInString  obj = new FindWordInString(s);
        obj.findWord();
    }
}
