package com.day2;

class Emp {
    int empno;// 사원번호
    String ename; // 사원명
    double salary; // 급여
}

public class Empsumulation {
    // 객체배열
    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.empno = 7566;
        emp.ename = "SCOTT";
        emp.salary = 2500;
        emp = new Emp();
        emp.empno = 7499;
        emp.ename = "Tiger";
        emp.salary = 3100;
        emp = new Emp();
        emp.empno = 7977;
        emp.ename = "JHON";
        emp.salary = 2300;
        System.out.println(emp.empno); // 0
        System.out.println(emp.ename); // null
        System.out.println(emp.salary); // 0.0
    }
}
/*
7566 SCOTT 2500
7499 Tiger 3100
7977 JHON 2300

 */