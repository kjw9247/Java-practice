package com.day5.design;
// 클래스 사이의 관계를 static으로 처리하지 않고
// 생성자로 처리하는 방법
import java.util.Random;

public class RandomGameLogic {
    int dap;
    RandomGameUI rgui = null;
    public RandomGameLogic(RandomGameUI randomGameUI) {
        // 전변에 대한 초기화 처리
        // NullPointerException 피할 수 있다 - 선언부에는 null 되어 있기 때문
        this.rgui = rgui;
    }
    public void nanSu(){
        System.out.println("채번 메서드 호출");
        // 정답채변하기 - 초기화
        Random rand = new Random();
        dap = rand.nextInt(10);
    }
    // front와 back 만나는 부분 ********
    // dap은 전변으로 하고 my는 지변으로 해결하였다
    // 게임의 룰이 있다 - 업무 처리영역
    // call by value, pass by value
    // my는 어디서 결정 되는가? - JTextField에 엔터쳤을 때
    // 어디로 가야하는가? - RandomGameEvent
    // 엔터를 쳤을 때 나는 판정하기 메소드를 호출한다
    public String 판정하기(int my){ // int my 지역이냐 전역이냐 선택할 수 있냐?
        String msg = null;
        if(dap == my){
            msg = ("축하합니다");
            //System.exit(0); // JVM과의 연결고리를 강제로 끊어낸다
        } else if (dap > my) {
            msg = ("높여라");
        }else if (dap < my) {
            msg = ("낮춰라");
        }
        return msg;
    }
}

/*
세개의 클래스 중에서 어떤 클래스에 main메서드를 두면 되는것인가?
세 개 클래스 중에서 어느곳에 actionPerformed를 오버라이딩 하면 되는것인가?
하나의 클래스를 세 개로 쪼개었을 때 클래스 사이의 의존 관계를
정하는 인스턴스화 구문은 어디에 어떤 클래스를 인스턴스화 해야하나?
static은 사용하지 않는 전제
 */