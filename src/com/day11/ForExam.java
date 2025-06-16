package com.day11;

public class ForExam {
    public static void main(String[] args) {
        int[] is = {1,2,3,4,5};
        // for (:) 개선된 for문
        for (int i : is){
            System.out.println(i);
        }
        String[] names = {"강감찬", "이순신", "김유신"};
           for(String name:names) {
               System.out.println(name);
           }

    }
}
