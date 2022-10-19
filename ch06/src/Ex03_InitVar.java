public class Ex03_InitVar {
    // 클래스 초기화 블럭
    static {
        System.out.println("static { }");
    }

    // 인스턴스 초기화 블럭
    {
        System.out.println("{ }");
    }

    public Ex03_InitVar(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("이것은 첫번째요");
        Ex03_InitVar EI = new Ex03_InitVar();

        System.out.println("이것이 두번째요");
        Ex03_InitVar EI2 = new Ex03_InitVar();
    }
}

    // 지역변수의 초기화
//class InitTest {
//    int x;
//    int y = x;
//
//    void method(){
//        int i;
//        int j = i;
//    }
//}

