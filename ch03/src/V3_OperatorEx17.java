public class V3_OperatorEx17 {

    // 사칙 연산자 + - * /
    // 16번 예제와 다르게 소숫점 반올림
    public static void main(String[] args) {

        double pi = 3.141592;
        double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
        System.out.println(shortPi);
    }
}
