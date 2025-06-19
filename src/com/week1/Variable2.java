package com.week1;
// 자바의 모든 부모 클래스는 Object이다
// extends를 하지 않더라도 Object는 무조건 상속이 된 상태이다
public class Variable2 extends Object{
    // 나는 여기에서 toString() 구현한적 없다
    // 구현하지 않은 메서드를 어떻게 재정의 할수 있는것인가?
    @Override
    public String toString(){
        return "나는 변수이다.";
    }
    public static void main(String[] args) {
      Variable2 v = new Variable2();
        System.out.println(v);
        System.out.println(v.toString());
        Object obj = "안녕";
        Object obj2 = new Object();
        // NullPointerException, NumberFormatException, CastingException
        String s = (String) obj2;
    }
}

