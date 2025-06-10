package com.day1.Note;
// 하나의 클래스에 변수 여러개 선언 가능함
// 부서번호, 부서명, 지역명은 모두 전변이다
// 전변을 외부 클래스에서 사용할 때는
// 1) 인스턴스화
// 2) 인스턴스변수명.변수명 - 이런식으로 호출이 가능하다
class DeptVO{
    int deptno; // 부서번호 10 / 20 / 30
    String dname; // 부서명 개발1팀 / 개발2팀 / 유지보수팀
    String loc; // 지역명 서울 / 부산 / 제주
}
// 원시형 변수는 한번에 하나만 담을 수 있다
// 같은 타입만 탐을 수 있다
public class V3 {
    public static void main(String[] args) {
        DeptVO d1 = new DeptVO();
        d1.deptno = 10; // 초기화
        d1.deptno = 100;
        d1.dname = "개발 1팀";
        d1.loc = "서울";
        DeptVO d2 = new DeptVO();
        d2.deptno = 20; // 초기화
        d2.dname = "개발 2팀";
        d2.loc = "부산";
        DeptVO d3 = new DeptVO();
        d3.dname = "유지보수팀";
        d3.loc = "제주";
        d3.deptno = 30; // 초기화
        System.out.println(d1.deptno);
        System.out.println(d2.deptno);
        System.out.println(d3.deptno);
    }
}