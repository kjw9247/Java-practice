package com.fwcollectuon;

import java.util.ArrayList;
import java.util.List;

// 인스턴스화
// 1. A a = new A();
// 2. Parent p = new Child() - 권장 - 다형성
// 3. Calendar cal = Calendar.getInstance() - 싱글턴
public class ListExam2 {
    public static void main(String[] args) {
    // 제네릭이 없으면 어떤 타입인지 알수가 없음
        // 생성부에는 제네릭 타입을 생략할 수 있다 - 다이아몬드 연산자
        List nameList = new ArrayList();
        boolean isExist = nameList.add("kiwi");
        if (isExist){
            System.out.println("내가 말한 키위 장바구니에 담았다");
        }
        // boolean isExist2 = nameList.add(1, "kiwi"); 성립이 안됨
        nameList.add(1, "kiwi");
        for (int i = 0; i < nameList.size(); i++) {
            Object name = nameList.get(i);
            System.out.println(nameList.get(i) instanceof String); // true
            System.out.println(name);
        }
    }
}
