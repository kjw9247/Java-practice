package com.week1;

import javax.swing.*;
import java.awt.*;

public class ViewChange2 extends ViewChange{

    public static void main(String[] args) {
        JTextArea jta = new JTextArea();
        JPanel jp = new JPanel();
    }
    public void initDisplay(){
        btn.addActionListener(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jta.setBackground(Color.lightGray);
        jp.setBackground(Color.gray);
        this.add("North", btn);
        this.add("Center", jta);
        this.setSize(300,300);
        this.setVisible(true);
    }
}
