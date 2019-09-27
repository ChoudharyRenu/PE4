package com.stackroute.pe4;

public class ReplaceDWithF {
    public String replaceDWithF(String s){
        String  result = s.replace("d","f");
        result = result.replace("l","t");
        return result;
    }
    public static void main(String[] args){
        ReplaceDWithF obj = new ReplaceDWithF();
        String s1 = obj.replaceDWithF("dil");
        System.out.println(s1);
    }
}
