package com.day1;

import java.util.Random;

public class Game2 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
        int num = rand.nextInt(10);
            System.out.println(num);
        }
    }
}// 채번된 숫자
// 채번이 먼저인가 숫자를 비교해서 힌트를 주는것이 먼저인가?