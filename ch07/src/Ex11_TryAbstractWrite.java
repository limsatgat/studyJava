// 추상클래스
abstract class Suheon {
    // 추상메서드
    abstract void java();
//    abstract void javascript();
}

//abstract class Junior extends Suheon{
class Junior extends Suheon {
    @Override
    void java() {
        System.out.println("공부 중");
    }
//    void javascript(){
//        System.out.println("병행해서 공부해야함");
//    }
}

public class Ex11_TryAbstractWrite {
    public static void main(String[] args) {
//        Suheon lim = new Suheon();
//        lim.java();

        Junior lim = new Junior();
        lim.java();
//        lim.javascript();
    }
}
