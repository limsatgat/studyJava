public class V5_PrintfEx2 {

    public static void main(String[] args) {

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;

        // 부동소수점, 지수표현식, 간략하게 값표현
        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

        System.out.println("");

        double d = 1.23456789;

        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n", d);    // 전체 14자리 중 소수점 10자리

        System.out.println("");

        String url = "www.lemonhealthcare.com";

        System.out.printf("[%s]%n", url);       // 문자열
        System.out.printf("[%30s]%n", url);
        System.out.printf("[%-30s]%n", url);    // 왼쪽정렬
        System.out.printf("[%.8s]%n", url);     // 왼쪽에서 8글자만 출력
    }
}
