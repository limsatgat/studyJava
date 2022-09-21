public class V3_OperatorEx10 {

    // 사칙 연산자 + - * /, 오버플로우
    public static void main(String[] args) {

        int a = 1000000;

        int result1 = a * a / a;    // 1_000_000 * 1_000_000 / 1_000_000
        int result2 = a / a * a;    // 1_000_000 / 1_000_000 * 1_000_000

        System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);     // 오버플로우
        System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
    }
}
