// 포함
class Computer {
    boolean power;
}

class Bluetooth { // 포함
    Computer com = new Computer();
    boolean pairing;

    void pairingBluetooth(String text) {
        if (pairing) {
            System.out.println(text);
        }
    }
}

//class Mouse {
//    Computer com = new Computer();
//}

public class Ex02_Computer {
    public static void main(String[] args) {
        Bluetooth buds = new Bluetooth();    // 블루투스 객체 생성
//        Mouse mo = new Mouse();

        buds.com.power = false;   // 조상으로부터 상속받은 멤버
        if (buds.com.power) {
            System.out.println("컴퓨터의 전원이 켜졌습니다.");
        } else {
            System.out.println("컴퓨터의 전원이 꺼져있는 상태입니다.");
        }

        buds.pairing = false;     // 알림 켜기
        buds.pairingBluetooth("버즈가 연결되었습니다.");

//        System.out.println(buds.com.toString());
//        System.out.println(mo.com.toString());
    }
}

/*
컴퓨터클래스와 블루투스클래스가 있습니다.
블루투스 클래스 안에 컴퓨터 클래스를 참조변수로 선언하였고
메인메소드에서 사용할수 있게끔 블루투스 클래스를 인스턴스로 생성하였습니다.
컴퓨터 클래스의 멤버를 사용하려면
버즈 안의 com 안의 power 이런 식으로 불러오기
*/
