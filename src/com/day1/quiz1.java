package com.day1;

import java.util.Scanner;

public class quiz1 {
    // 1부터 5까지의 합을 구하는 프로그램을 작성하시오
    // 이 문제를 풀기 위해 변수 몇 개가 필요한가?
    // 선언한 변수의 초기화를 어떻게 해야하나

    public static void main(String[] args) {
        // 1부터 5까지의 합을 담을 변수 선언
        int hap=0;
        int j = 0;
        for(j=0;j<5;j++) {
            int num = j+1;
            hap = hap + num;
        }
        System.out.println(hap);
        /* int hap = 0;
        hap = hap + i;
        i = i+1;
        hap = hap + i;
        i = i+1;
        hap = hap + i;
        i = i+1;
        hap = hap + i;
        i = i+1;
        hap = hap + i;
        System.out.println(hap); */
         for (int i=0;i<5;i++){
             hap = hap + i;
            // 변수 i가 증가하여 5가 되면 for문을 빠져 나간다
            System.out.println(i);// 0, 1, 2, 3, 4

        } // end of for
        System.out.println("여기==>"+ hap); //5,6
    }
}
