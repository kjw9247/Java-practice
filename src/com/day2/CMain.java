package com.day2;

class C{
    int ival;

}

// 제어권 - 객체 관리 - 라이프 사이클 - 메모리
// 로컬객체 관리 -> 원격개체 관리가 굉장히힘듦
public class CMain {
    C c = new C();
    public static void main(String[] args) {
        // CMain에서 ival 변수를 호출 하려면?
        // 인스턴스화가 될 때마다 전역 변수도 초기화가 된다 - 0
        C c = new C(); // 지변
        c.ival = 10;
        c.ival = 20;
        System.out.println(c.ival); // 0-> 10 (상태)
        // c = new C(); // 지변
        // 원본이 바뀌면 사이드 이펙트가 발생할 수 있다 - 어려움
        c.ival = 100;
        System.out.println(c.ival); // 0-> 100 (상태)
    }
}
