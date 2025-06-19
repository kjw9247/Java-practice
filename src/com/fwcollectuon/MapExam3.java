package com.fwcollectuon;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
// Map은 충돌 이수 - key값이 중복되지 않아야 한다
// 불변객체
public class MapExam3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "kiwi");
        map.put(1001, "apple");
        map.put(1002, "tomato");
        // map.clear();
        // 불변객체는 수정 할 수는 없어서 기존 키값을 읽어오고
        // 기존키를 삭제한 다음 새로운 키로 값을 추가한다
        // Map 랜덤하게 처리한다
        // 키를 사용해서 원하는 정보를 찾는다 - 속도 잇점이다
        Set<Integer> keys = map.keySet();
        map.remove(1000);
        map.put(2000, "kiwi");
        System.out.println(map.get(1000));
        System.out.println(map.containsKey(1000));
        System.out.println(map.containsKey(2000));
        System.out.println(map.get(2000));
        System.out.println(map.isEmpty());
    }
}

