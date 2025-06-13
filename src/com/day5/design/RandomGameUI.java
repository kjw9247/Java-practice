package com.day5.design;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomGameUI {
        // 선언부
        // 객체 주입시 순환구조가 되지 않도록 주의할 것.
        RandomGameEvent rge = new RandomGameEvent(this);
        RandomGameLogic rgl = new RandomGameLogic(this);
        JFrame jf = new JFrame("숫자게임-Ver2");
        JPanel jp_center = new JPanel();
        JPanel jp_east   = new JPanel();
        JButton btnNew   = new JButton("새게임");
        JButton btnClear = new JButton("지우기");
        JButton btnDap   = new JButton("정답");
        JButton btnExit  = new JButton("나가기");
        // 다중행
        JTextArea jta = new JTextArea(5,15);
        JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        // 단일행
        JTextField jtf = new JTextField();
        int count = 0; // 게임 회차를 표시하는 변수이다
        int dap = -1;
        int my;





    // 화면 그리기
    public void initDisplay(){
        System.out.println("화면 출력하기");
        jta.setEditable(false); // 수정모드 끄기
        jp_east.setLayout(new GridLayout(4,1));
        jp_east.add(btnNew);
        jp_east.add(btnClear);
        jp_east.add(btnDap);
        jp_east.add(btnExit);
        jta.setBackground(Color.lightGray);
        // 내 안에 actionPerformed가 있지 않다 - 외부에 있다
        // 외부에 객체 사용할 떄는 인스턴스화

        btnClear.addActionListener(rge);
        btnDap.addActionListener(rge);
        btnNew.addActionListener(rge);
        jtf.addActionListener(rge);
        btnExit.addActionListener(rge);

        jf.add("Center", jsp);
        jf.add("South", jtf);
        jf.add("East", jp_east);
        jf.setSize(400,300);
        jf.setVisible(true);

    }

    // 메인 메소드
    public static void main(String[] args) {
        RandomGameUI rgui = new RandomGameUI();
        rgui.initDisplay();
    }
}
