package com.day3;

class D1 {
    int ival;
    void methodA(D1 d1){
        System.out.println(d1);
    }
}

public class D1Main {
    public static void main(String[] args) {
        D1 d1 = new D1();
        System.out.println(d1.ival);//
        d1 = null;
        d1.methodA(d1);
        d1.methodA(null);
        System.out.println(d1.ival);//
        d1 = new D1();
        d1.ival = 10;
        System.out.println(d1.ival); //
    }
}
