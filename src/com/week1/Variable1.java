package com.week1;

import javax.swing.*;

//변수 - 배열 - 참조변수 - 객체배열 - 자료구조(collection) - 쿠키/세션(보안,상태관리)
public class Variable1 {
    // 원시형 변수 - 8가지
    // boolean - if문, for문
    // int - 정수, double - 실수
    // 타입이 갖는 값의 범위
    public static void main(String[] args) {
        int[] is = new int[3]; // 객체
        for (int i:is){
            System.out.println(i); // 0 0 0
        }
        // 배열 안에 감긴 타입이 객체인 경우
        // 주소번지를 2번 접근 해야한다 - 어려움
        JButton[] btns = new JButton[3];
        for (JButton btn:btns){
            System.out.println(btn); // null null null
        }
    }
}

