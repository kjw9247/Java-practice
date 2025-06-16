package com.day11.design;

public class SoundsWithSqueak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삐이익");
    }
}
