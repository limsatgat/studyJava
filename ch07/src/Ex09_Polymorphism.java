
// 다형성
class Tv {
    boolean power = true;

    void deviceOn() {
        if (power) {
            System.out.println("전원켜기");
        } else {
            System.out.println("전원끄기.");
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

    @Override
    void deviceOn(){
        super.deviceOn();
        if (power) {
            System.out.println("셋탑켜기");
        } else {
            System.out.println("전원끄기.");
        }
    }
}

class LedTv extends Tv {
    // SmartTv와 테스트하려고 만들어 둔 클래스
}

public class Ex09_Polymorphism {
    public static void main(String[] args) {
        // 다형성
        Tv tv = new Tv();               // 부모 본인
//        Tv tv = new SmartTv();          // 부모가 자식을
//        tv.deviceOn();

        /**/
//        tv.super

        SmartTv sTv = new SmartTv();    // 자식 본인
//        SmartTv sTv = new Tv();           // 자식을 부모가

//        LedTv lTv = (LedTv)sTv;       // 관계없는 클ㄹㅐ스끼리는?

/******************************************************************/

//        // 참조타입의 형변환 테스트
//        Tv ttv = null;
//        SmartTv sTTv = new SmartTv();
//        SmartTv sTTTv = null;
//
//        ttv = (Tv)sTTv;
//        sTTTv = (SmartTv)ttv;

        //instanceof 연산자
//        if (sTv instanceof Tv) {
//            System.out.println("형변환이 가능합니다.");
//        }

//        if (tv instanceof SmartTv){
//            System.out.println("형변환이 가능합니다");
//        } else {
//            System.out.println("형변환이 불가능합니다");
//        }

//        if (sTv instanceof Object) {
//            System.out.println("형변환이 가능합니다.");
//        }

//        if (
//
    }
}
