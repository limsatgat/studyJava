import org.omg.CORBA.Object;

// 다형성
class Tv {
    boolean power = true;

    void deviceOn() {
        if (power) {
            System.out.println("전원을 켰습니다.");
        } else {
            System.out.println("전원을 껐습니다.");
        }
    }
}

class SmartTv extends Tv {
    boolean caption = true;    // 자막

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

class LedTv extends Tv {
    // SmartTv와 테스트하려고 만들어 둔 클래스
}

// 참조변수의 형변환
public class Ex09_Polymorphism {
    public static void main(String[] args) {
        // 다형성
//        Tv tv = new Tv();               // 부모 본인
        SmartTv sTv = new SmartTv();    // 자식 본인
//        Tv tv = new SmartTv();          // 부모가 자식을
//        Smart sTv = new Tv();           // 자식을 부모가
//        LedTv lTv = (LedTv)sTv;       // 관계없는 클ㄹㅐ스끼리는?

//        // 참조타입의 형변환 테스트
//        Tv ttv = null;
//        SmartTv sTTv = new SmartTv();
//        SmartTv sTTTv = null;
//
//        sTTv.deviceOn();
//        ttv = (Tv)sTTv;
////        ttv.displayCaption();
//        sTTTv = (SmartTv)ttv;
//        sTTTv.displayCaption("야옹");

        //instanceof 연산자
        if (sTv instanceof Tv) {
            System.out.println("형변환이 가능합니다.");
        }
        if (sTv instanceof Object) {
            System.out.println("형변환이 가능합니다.");
        }
    }
}
