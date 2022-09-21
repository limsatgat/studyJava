public class V3_OperatorEx12 {

    // 사칙 연산자 + - * /
    public static void main(String[] args) {

        char c1 = 'a';      // c1에는 문자 'a'의 코드값인 97이 저장된다.
        char c2 = c1;       // c1에 저장되어 있는 값이 c2에 저장된다.
        char c3 = ' ';      // c3를 공백으로 초기화

        int i = c1 + 1;     // 'a'+1 → 97+1 → 98

        c3 = (char)(c1 + 1);        // b, 유니코드 98
        c2++;
        c2++;

        System.out.println("i = " + i);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
