package com.week1.baseball;

import com.day11.Parameter;

public class Account {
    int[] com = {3,5,7};
    int[] my = {1,3,7}; // 1스 1볼
    public String 파정하기(String input){
        int strkie = 0;
        int ball = 0;
        for (int i = 0; i < input.length() ; i++) {
            for (int j = 0; j < input.length(); j++) {
                // 일단 볼은 확보 - 숫자가 존재함
                if(com[i] == my[j]){
                    if(i == j) {// 같은 숫자가 자리까지 일치하면 스트라이크

                    }else{// 볼확정
                        ball++; 
                    }

                }
            }
        }
        return strkie+"스 "+ball+"물";
    }
    public static void main(String[] args) {

    }
}

/*
사용자가 숫자를 입력하고 엔터하면 1스 1볼이라고 출력 해준다
Strike, ball 전변  지변
사용자가 숫자를  새로 입력 할때마다 카운드 되는 숫자는 달라져야 한다
그러면 지역변수로 한다
 */