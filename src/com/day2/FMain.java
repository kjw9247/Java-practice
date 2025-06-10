package com.day2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class F implements ActionListener {
    JFrame f = new JFrame();
    String b1_label = "비활성화";
    JButton b1=new JButton(b1_label);
    //화면을 그리는 메소드 입니다.
    void initDisplay(){
        System.out.println("initDisplay");
        String title = new String("숫자맞추기게임");
        b1.addActionListener(this);
        f.add("North", b1);
        f.setTitle(title);
        f.setSize(400,400);
        f.setVisible(true);
    }
    //콜백함수 - 버튼이 눌려졌을 때 JVM이 호출해줌.
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        //너 비활성화 버튼 누른거야?
        if(obj==b1){

        }

    }
}
public class FMain {
    public static void main(String[] args) {
    }
}