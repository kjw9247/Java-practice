package com.fwcollectuon;

import com.day11.Parameter;

import java.util.ArrayList;
import java.util.List;


public class ListExam3 {
    public static void main(String[] args) {
        // 생성부에는 제네릭 타입을 생략할 수 있다 - 다이아몬드 연산자
        // 제네릭에 String타입을 적으면 int는 담을 수 없다
        // 대화명 리스트
        List<Object> nameList = new ArrayList<>(); // String -> Object를 한다면?
        boolean isExist = nameList.add("kiwi");
        if (isExist){
            System.out.println("내가 말한 키위 장바구니에 담았다");
        }
        // boolean isExist2 = nameList.add(1, "kiwi"); 성립이 안됨
        // vlaue자리에 Object - 객체배열, List, Map
        nameList.add(1, "kiwi");
        nameList.add(2, 5);
        nameList.add(3, new int[]{1,2,3});
        // C# - 사용자가 입력받은 타입이 기본적으로 text - 문자열
        nameList.add(2, String.valueOf(5));
        nameList.add(2, String.valueOf(5.0));
        nameList.add(2, String.valueOf(true));
        // api 적용해보기 & 타입체크(CastingException
        // 화면(chart - 도형으로)에 데이터 바인딩 하기 - 회의
        // Front
        // Back - int[] - res.json(result)
        for (int i = 0; i < nameList.size(); i++) {
            Object name = nameList.get(i);
            System.out.println(nameList.get(i) instanceof String); // true
            System.out.println(name);
            if (nameList.get(i) instanceof int[]){
                for (Object obj:nameList){
                    if (obj instanceof int[]){
                        int[] arr = (int[])obj;
                        for(int a: arr) {
                            System.out.println(a);
                        }
                    }
                }
            }
        }
    }
}
