public class V3_OperatorEx30 {
    static String toBinaryString(int x){            // 10진 정수를 2진으로 변환
        String zero = "00000000000000000000000000000000";       // 4 byte의 정수, 32자리
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);
    }

    // 비트 전환 연산자
    public static void main(String[] args) {
        int dec = 8;

        System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 1));
        System.out.println();

        System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec >> 0));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec >> 1));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec >> 2));
        System.out.println();

        dec = -8;
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 1));
        System.out.println();

        System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec >> 0));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec >> 1));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec >> 2));
        System.out.println();

        dec = 8;
        System.out.printf("%d >> %2d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %2d = %4d \t%s%n", dec, 32, dec >> 32, toBinaryString(dec >> 32));
    }

}
