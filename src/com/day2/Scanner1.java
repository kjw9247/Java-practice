package com.day2;

import java.util.Scanner;

// 0부터 9사이의 임의의 숫자를 채번한다
// 채변된 숫자들 정답이다
// 5번(반복문) 기회동안 그 숫자를 맞추는 게임이다
public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사용자가 exit을 입력하면 while문을 빠져나가도록 코딩 하시오
        while (true){ // counter가 5가되면 while문을 빠져 나간다
            System.out.println("0부터 9사이의 숫자를 입력하세요");
            String userInput = sc.nextLine();
            if ("exit".equals(userInput)) {
                sc.close();
                break; // while 문을 빠져 나가고 싶을때
            }
            System.out.println("사용자가 입력한 값은 "+userInput);
        }// end of while 반복문
        System.out.println("여기");
    }// end of main
}// end of Scanner
