package com.day1.Note;

public class String1 {
    public static void main(String[] args) {
        String s1 = new String("하나");
        String s2 = new String("하나");
        // s1의 주소번지와 s2의 주소번지가 같아? - 달라
        System.out.println(s1 == s2);// 참, 거짓? -> 여긴 false다
        // s1이 가리키는 문자열 값과 s2가 가리키는 문자열 값이 같니?
        System.out.println(s1.equals(s2));// true
        String s3 = s1; // 얕은 복사
        System.out.println(s3 == s1); // 같은 주소번지 일것이다
        System.out.println(s3.equals(s1));
        String s4 = "하나";
        // s4처럼 new사용하지 않고 객체를 생성하면 이미 있는
        // 하나 문자열 객체를 참조한다
        System.out.println(s1 == s4); // false
        System.out.println(s1.equals(s4)); // true
        //
    }
}
