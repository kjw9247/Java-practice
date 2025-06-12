package com.day4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIMain1 implements ActionListener {
    UISub1 uiSub = new UISub1();

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("입력")){
            System.out.println("입력 호출");
            uiSub.set(command,true);
        }
        else if (command.equals("수정")){
            System.out.println("수정 호출");
            uiSub.set(command,true);
        }
        else if (command.equals("상세")){
            System.out.println("상세보기 호출");
            uiSub.set(command,true);
        }
    }

    JFrame jf = new JFrame();
    JPanel jp_north = new JPanel();
    JButton btnInsort = new JButton("입력");
    JButton btnUpdate = new JButton("수정");
    JButton btnDelete = new JButton("삭제");
    JButton btnDetail = new JButton("상세보기");

    public void initDisplay() {
        btnInsort.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnDetail.addActionListener(this);

        jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
        jp_north.add(btnInsort);
        jp_north.add(btnUpdate);
        jp_north.add(btnDelete);
        jp_north.add(btnDetail);

        jf.add(jp_north);
        jf.setSize(400,500);
        jf.setVisible(true);

    }
    public static void main(String[] args) {
        UIMain1 ui = new UIMain1();
        ui.initDisplay();
    }

}
