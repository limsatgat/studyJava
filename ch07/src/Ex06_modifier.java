class StaticModifier {
    static int width = 100;
    static int height = 120;
    int overtest = 500;

    static {
        // static 변수의 복잡한 초기화 블록
    }

    static int max(int a, int b) {
//        System.out.println(overtest);
        return a > b ? a : b;
    }
}

/************************************************************/

final class FinalModifier {
    final int MAX_SIZE = 10;

    final void getMaxSize() {
        final int localVar = MAX_SIZE;
//        localVar = 20;
    }
}

/************************************************************/

abstract class AbstractModifier {    // 추상클래스
    abstract void move();   // 추상메서드
}


public class Ex06_modifier {
    public static void main(String[] args) {
//        AbstractModifier a = new AbstractModifier();    // 인스턴스 생성불가

    }
}
