package com.day3;

public class B1 {
    // 값이 변하면 사이드이펙트 발생할 수 있다 - 어렵다
    int ival; // 전변이기 때문에 기본값이 0
    public static void main(String[] args) {
        // b1은 전변이다 ? 지변이다 ?
        // 깊은 복사
        B1 b1 = new B1(); // 주소번지가 다르다    셋다 B1 타입
        B1 b11 = null;
        System.out.println(b11);
        b1.ival = 10;
        System.out.println(b1); // @abcd1234
        b1 = new B1(); // 주소번지가 다르다
        b1.ival = 20;
        System.out.println(b1); // @abcd1235
        b1 = new B1(); // 주소번지가 다르다
        b1.ival = 30;
        System.out.println(b1); // @abcd1236
        // 타입은 같지만 서로 다른 객체이다 - 다형성, 싱글턴
    }
}
