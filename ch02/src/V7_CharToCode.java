public class V7_CharToCode {

    // 문자의 유니코드 알아내는 방법, 어떤 유니코드가 어떤 문자인가
    public static void main(String[] args) {
        char ch = 'A';  // char ch = 65;
        int code = (int)ch; // ch에 저장된 값을 int 타입으로 변환하여 저장

        // 문자, 10진, 16진
        System.out.printf("%c = %d(%#X)%n", ch, code, code);

        char hch = '가'; // char hch = 0xAC00;
        System.out.printf("%c = %d(%#X)%n", hch, (int)hch, (int)hch);
    }
}