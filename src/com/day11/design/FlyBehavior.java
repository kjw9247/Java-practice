package com.day11.design;
// 예약어가 class가 아니라 interface
public interface FlyBehavior {
    // 추상메서드 -> 결합도를 낮추는 코드를 작성하기 위해서
    // 상속이 재사용성의 모범답안은 아닐 수 있다 - 결합도가 높다
    // 인터페이스는 일반 메서드를 가질 수 없다 - abstract를 생략한다
    public void fly(); // 추상메서드이기 때문에 좌중괄호와 우중괄호가 없다
}
