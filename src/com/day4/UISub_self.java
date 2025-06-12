package com.day4;

import javax.swing.*;

public class UISub_self {
    JDialog jd = new JDialog();
    public UISub_self(){
        // initDisplay();
    }
    public void initDisplay(String title){
        //jd.setTitle("입력|수정|상세보기");
        jd.setTitle(title);
        jd.setSize(400,500);
        jd.setVisible(true);
    }
}
