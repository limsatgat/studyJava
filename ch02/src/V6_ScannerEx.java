// 또는 import java.util.Scanner;
import java.util.*;

public class V6_ScannerEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수 중 하나를 임의로 입력해주세요.(10~99) : ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);  // 입력받은 문자열을 숫자로 변환
        // 실수는 Double.parseDouble()


        System.out.println("입력 숫자 : " + input);
        System.out.printf("출력 숫자 : %d%n", num);
    }
}