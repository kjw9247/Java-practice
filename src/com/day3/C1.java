package com.day3;

public class C1 {

    public static void main(String[] args) {
        C1 c1 = new C1();
        System.out.println(c1);
        c1 = null; // 객체지향 언어에선 초기화
        System.out.println(c1); // null
        c1 = new C1();
        System.out.println(c1);
    }
}