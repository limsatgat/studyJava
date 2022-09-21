public class V3_OperatorEx18 {

    // 사칙 연산자 + - * /
    // Math.round : 소수 첫 번째 자리를 반올림, 올림은 Math.ceil(), 내림은 Math.floor()
    public static void main(String[] args) {

        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);
    }
}
