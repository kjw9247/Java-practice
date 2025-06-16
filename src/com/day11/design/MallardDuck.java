package com.day11.design;
// 상속을 받으면 부모가 정의한 전변을 사용할 수 있다
// 선언이 없어도 사용이 가능하다
public class MallardDuck extends Duck {
    // 오리라는 추상 클래스의 실제 구현체 클래스이다
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("나는 청둥오리입니다");
    } // 클래스가 왔을땐 extends 인터페이스는 implements
}
