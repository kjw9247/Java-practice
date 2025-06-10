package com.day2.quiz;

public class Cast1 {
    public static void main(String[] args) {
        // int(4byte) < long(8byte) < float(4byte) < double(8byte)
        int i = 1;
        double d = 2.1; // double은 실수형이다(소수점을 담을 수 있다)
        i = (int)d; // casting operation - 형전환 연산자
        // d = i; // 오른쪽에 더 작은 타입이 오는 것은 늘 합법이다
        // 그러나 오른쪽에 더 큰타입이 오는것은 불가하다
        // 강제로라도 넣고 싶다면 소수점은 빼고 담아줄께 - 캐스팅 연산자
        System.out.println(i); // 2
        System.out.println(d); // 2.1
    }
}
