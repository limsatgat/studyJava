import java.util.Scanner;

public class V3_OperatorEx25 {

    // 논리 연산자
    // 입력한 값 판단
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = ' ';

        System.out.printf("숫자 또는 영문자를 입력하세요(한자리) : ");

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if('0'<= ch && ch <= '9'){
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }

        if(('a'<=ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')){
            System.out.printf("입력하신 문자는 영문자입니다.&n");
        }
    }   // main
}
