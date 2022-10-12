public class Ex05_Constructor {
    public static void main(String[] args) {
        Test first = new Test();
//        Test2 second = new Test2();

        System.out.println(first);
//        System.out.println(second);
    }
}
class Test {
    int value;
}
class Test2 {
    int value;
    Test2(int x) {   // 매개변수가 있는 생성자
        value = x;
    }
}