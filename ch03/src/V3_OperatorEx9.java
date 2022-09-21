public class V3_OperatorEx9 {

    // 사칙 연산자 + - * /, 오버플로우
    public static void main(String[] args) {

        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
