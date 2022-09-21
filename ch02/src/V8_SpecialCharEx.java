public class V8_SpecialCharEx {

    // 특수 문자 다루기
    public static void main(String[] args) {
        // 역슬래쉬
        System.out.println('\'');               // '''처럼 할 수 없다

        // 백스페이스
        System.out.println("abc\t123\b456");    // \b에 의해 3이 지워진다.

        // 개행
        System.out.println('\n');               // 개행

        // 큰따옴표
        System.out.println("\"Hello\"");        // 큰따옴표안의 내용을 출력하기 위함

    }
}
