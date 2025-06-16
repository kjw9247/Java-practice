package com.day11;
// Object vs class
public class Parameter {
    void methodA(int[] haps){
        if(haps == null){
            return;
        }
        for(int hap: haps){
            System.out.println(hap); // 0 0 0
        }
    }
    int[] methodB(){
        return null;
    }
    public static void main(String[] args) {
        Parameter P1 = new Parameter();
        P1.methodA(new int []{1,2,3});
        P1.methodA(new int []{2,4,6});
        P1.methodA(null);
    }
}
