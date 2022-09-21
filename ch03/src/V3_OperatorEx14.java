public class V3_OperatorEx14 {

    // 사칙 연산자 + - * /
    // 소문자, 대문자, 숫자 출력
    public static void main(String[] args) {

        char c = 'a';
        for (int i=0; i<26; i++){
            System.out.print(c++);
        }
        System.out.println();

        c = 'A';
        for (int i=0; i<26; i++){
            System.out.print(c++);
        }
        System.out.println();

        c = '0';
        for (int i=0; i<10; i++){
            System.out.print(c++);
        }
        System.out.println();
    }
}
