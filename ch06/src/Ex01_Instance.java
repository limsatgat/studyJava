// 인스턴스의 생성과 사용
public class Ex01_Instance {

    String color;   // 색상
    boolean power;  // 전원상태(on/off)
    int channel;    // 채널

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class TvControl {
    public static void main(String[] args) {
        Ex01_Instance tv = new Ex01_Instance();
        tv.channel = 7;
        tv.channelDown();
        System.out.println("현재 채널은 " + tv.channel + " 입니다.");
    }
}
