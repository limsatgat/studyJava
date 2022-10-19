class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void superValue() {
        System.out.println("기본 x의 값 = " + x);
        System.out.println("super x의 값 = " + super.x);
    }
}

public class Ex04_Super {
    public static void main(String[] args) {
        Child c = new Child();
        c.superValue();
    }
}

// 자식클래스 멤버가 있을 때와 없을 때로 테스트