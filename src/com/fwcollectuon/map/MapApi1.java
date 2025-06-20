package com.fwcollectuon.map;

import java.util.HashMap;
import java.util.Map;

public class MapApi1 {
    public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();
        map.put(100, "빨강");
        map.put(200, "초록");
        map.put(300, "파랑");
        System.out.println(map.size()); // 3
        // map.clear();
        System.out.println(map.size()); // 3
        Object obj = map.clone();
        System.out.println(obj instanceof HashMap);// true
        HashMap map1 = (HashMap) obj;
        System.out.println(map1.get(100));
        boolean isOK = map.containsKey(200);
        System.out.println(isOK); // true
        System.out.println(map.get(200)); // 초록
        System.out.println(map1.isEmpty());
        // 얕은 복사인지 증명 하는 코드 작성
        map1.get(200);
    }
}
