package com.day11;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println(5/2);
            // 가상머신과의 연결고리 끊김
            System.exit(0);
        }catch (ArithmeticException e){
            System.out.println("여기");
        }finally {
            System.out.println("finally 무조건 실행된다");
        }
    }


}
