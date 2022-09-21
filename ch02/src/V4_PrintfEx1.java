public class V4_PrintfEx1 {

    // printf의 지시자
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        System.out.printf("b=%d%n", b);                 // 10진
        System.out.printf("s=%d%n", s);                 // 10진
        System.out.printf("c=%c, %d %n \n", c, (int)c);    // 문자, 유니코드

        int finger = 10;

        System.out.printf("finger=[%5d]%n", finger);        // 공백을 그대로 표현
        System.out.printf("finger=[%-5d]%n", finger);       // 오른쪽부터 5자리로 표현(왼쪽정렬)
        System.out.printf("finger=[%05d]%n\n", finger);     // 공백 대신 0으로 채움

        long big = 100_000_000_000L;    // long big = 100,000,000,000
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        System.out.printf("big=%d%n", big);             // 10진
        System.out.printf("hex=%#x%n\n", hex);          // 16진

        int octNum = 010;   // 8진수의 10, 10진수로는 8
        int hexNum = 0x10;  // 16진수의 10, 10진수로는 16
        int binNum = 0b10;  // 2진수의 10, 10진수로는 2

        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
    }
}