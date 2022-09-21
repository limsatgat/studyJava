public class V11_FloatToBinEx {

    public static void main(String[] args) {
        float f = 9.1234567f;
        // float타입의 값을 int타입의 값으로 해석해서 반환
        int i = Float.floatToIntBits(f);

        // 최대 표현 범위에서 반올림
        System.out.printf("%f%n", f);

        // 16진수로 출력
        System.out.printf("%X%n", i);   // 16진수로 출력
    }   // main의 끝
}
