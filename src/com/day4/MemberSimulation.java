package com.day4;
// 접근제한자 - public > protected > friendly > private
// access modifier
// private이면 외부에서 접근이 불가하다
public class MemberSimulation {
    public static void main(String[] args) {
        Member member = new Member();
        System.out.println(member);
        // private통해서 외부에서 직접 접근을 강제로 막음
        // member.name = "홍길동"; // 캡슐레이션
        // 캡슐화로 된 변수에 값을 초기화 하는 방법은 setter 사용함
        member.setAge(30);
        member.setName("홍길동");
        member.setEmail("hong@hot.com");
        // System.out.println(member.age);
        // System.out.println(member.name);
        // System.out.println(member.email);
        System.out.println(member.getAge());
        System.out.println(member.getName());
        System.out.println(member.getEmail());
        // member인스턴스는 사용자마다 싶은 복사됨
        // 사람수 만큼 만들어짐 - 전변
    }
}
