public class V3_OperatorEx26 {

    // 논리 연산자 의 효율적인 연산
    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        System.out.printf("a = %d, b = %d%n", a, b);
        System.out.printf("a! = 0 || ++b != 0 (%b)%n", a!=0 || ++b!=0);
        System.out.printf("a = %d, b = %d%n", a, b);
        System.out.printf("a == 0 && ++b != 0 (%b)%n", a==0 && ++b!=0);
        System.out.printf("a = %d, b = %d%n", a, b);
    }
}
