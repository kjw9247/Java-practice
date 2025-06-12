package com.day4;
class A6 {

}
public class A6Main {
    int j;
    void methodA() {
        int i = 0;
        A6Main am = new A6Main();
        // 지역변수 i는 인스턴스변수명.i라고 쓸 수 없다
        // System.out.println(am.i);
        // System.out.println(this.i);
        System.out.println(am.j);
        // this는 현재 활성화 되어 있는 객체 참조함
        // 원본이 바뀐것처럼 0이 아니고 10이 출력됨
        System.out.println(this.j);
    }
    public static void main(String[] args) {
        // A6Main 클래스에서 선언된 메서드 이더라도 static 영역에서
        // 호출하려면 인스턴스화 해야 함
        A6Main am = new A6Main();
        am.j = 10;
        am.methodA();
        // methodA(); // 안됨
    }
}
