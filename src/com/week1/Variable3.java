package com.week1;
// 클래스도 타입이다
class Member {
    // 접근제한자를 public하거나 private 할 수 있다
    // private - 외부에서 위변조 하는것을 방어하기 위해서 이다
    // 제품(상품) - 균일한 품질을 보장해야 한다
    public String mem_id;
    public String mem_name;
    public int mem_age;
}

public class Variable3 {
    public static void main(String[] args) {
        Member m1 = new Member();
        System.out.println(m1);
        m1.mem_id = "kiwi";
        m1.mem_id = "apple";
        m1.mem_age = 17;
        System.out.println(m1.mem_id); // kiwi
        m1.mem_name = "사과나무";
        m1 = new Member(); // 싱글톤은 아니다 복사본이다
        System.out.println(m1);
        m1.mem_name = "키위나무";

    }
}

/*
한 번에 하나만 담을 수 있다 - 동시에 두 가지를 기억 할 수 없다
같은 타입만 담을 수 있다
바닐라스크립트 - 타입스크립트 - 타입에 대한 이슈가 있다
만일 다른 여러개의 타입을 하나의 타입으로 선언 할 수 있을까?
 */