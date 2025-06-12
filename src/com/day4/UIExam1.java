package com.day4;

import javax.swing.*;

public class UIExam1 {
    public static void main(String[] args) {
        JButton btns[] = new JButton[4]; // 객체 배열
        String btn_labels[] = {"입력","수정","삭제","상세보기"};
        for (int i=0;i < btn_labels.length; i++) {
            btns[i] = new JButton(btn_labels[i]);
        }
    }
}
