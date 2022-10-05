import java.util.Scanner;

public class Ex12_do_while {

    public static void main(String[] args) {

        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;    // 1~100 사이의 임의의 수를 저장
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1과 100사이의 정수를 입력하세요 : ");
            input = sc.nextInt();

            if (input > answer)  {
                System.out.println("더 작은 수로 다시 시도하시오");
            } else if (input < answer)  {
                System.out.println("더 큰 수로 다시 시도하시오");
            }
        } while (input!=answer);
        System.out.println("정답입니다.");
    }
}