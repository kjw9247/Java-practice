/* package com.day4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// 이벤트 핸들러 클래스
class AEvent implements ActionListener {
    // callback 메소드 - 개발자가 호출하는 메소드가 아니다
    // 시스템(JVM) - 이벤트 감지되면 그 때 호출을 대신 해준다
    // JButton은 AView에서 만들어진 원본을 AEvent에서 사용해야 함.
    AView aview = null; // 이렇게 해야 원본을 쓸 수 있다
    // AView aView = new AView();
    // 깊은복사 - 두개가 만들어짐
    // 원본이 클릭 전에서 클릭 후로 바뀌어야 하는데 복사본이 바뀐다
    AEvent(Aview aview){
        // 아래처럼 전변과 초기화를 하지 않으면 NullPointerException이 발생함
        this.aview = aview;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        // 클릭전 버튼을 누른건가?
        if(obj == aview.jb1){
            // 클릭 전 -> 클릭 후
            // 검정색 말고 -> 빨강으로 바꿔줘
        }

    }
}

public class AView {
    // 선언과 생성을 분리하였다
    // 참조형은 디폴트가 null이다
    // NullPointException 상황을 연출
    JFrame jf = null;
    JButton jb1 = new JButton("클릭 전");
    public AView() {
        System.out.println("AView()디폴트 생성자 호출");
        // 이벤트 소스와 이벤트 처리를 담당하는 클래스 연결
        // 아래에서 this는 자기자신을 가르키는 수정자 이다 - AView
        // AView가 이벤트를 처리하는 핸들러 클래스가 아니다
        // 왜인가? -> ActionListener implements하지 않았다
        // actionFormed가 없으므로 이벤틀처리를 하는 핸들러클래스가 아니다
        // AEvent ae = new AEvent(); // AEvent 디폴트 생성자를 호출함
        jb1.addActionListener(this);
        // jb1.addActionListener(this);
        jf = new JFrame("제목");
        jf.add("North", jb1);
        jf.setSize(400,400);
        jf.setVisible(true);
    }
    public static void main(String[] args) {

        new AView();
    }
} */
