public class V10_FloatEx1 {

    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.234567890123456789f;

        double d = 9.12345678901234567890;

        System.out.printf("f  :   %f%n", f);        // %f =소수점 이하 6번째 자리까지 출력
        System.out.printf("f2 : %24.20f%n", f2);
        System.out.println("");
        System.out.printf("f  : %24.20f%n", f);     // 전체 24자리 중에서 20자리는 소수점 이하의 수
        System.out.printf("d  : %24.20f%n", d);
    }
}
