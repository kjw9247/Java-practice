package com.day1.Note;

public class V1 {
    public static void main(String[] args) {
        // 변수 선언은 기억 해줘
        int x;// 변수 선언 - 타입옴 - 그러나 아직 초기화는 하지 않음
        x = 1;// 변수 x에 대해 초기화 하였다
        int age = 25;
        int wheelNum = 4;
        // primative data type
        // 윈시형 타입은 호출하면 값이 나온다
        // 참조형 타입은 호출하면 주소번지가 출력됨 - 원본인가 복사본인가가 중요하다
        // 인스턴스화 -> A a = new A() -> heap메모리 영역 상주한다
        // a를 인스턴스 변수라고 한다 대문자 A는 클래스 타입 A라고 말함
        System.out.println(age); // 25 값이 출력 된다
    }
}
/*
클래스를 실행하려면 main 메소드를 선언함
메소드 안에서 선언된 변수는 지변이다
 */