import java.util.Scanner;
// 백준 10818번
// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
public class Q3_Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 주어진 N개의 정수
        System.out.println("입력된 값만큼의 길이의 배열이 생성됩니다.");
        int N = input.nextInt();
        // 정수를 담을 arr 배열
        int arr[] = new int[N];
        int minValue = 0;
        int maxValue = 0;

        System.out.println("배열에 들어갈 숫자를 \'" + N + "\'개 입력하세요");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

            // 최대값과 최소값 구하기
            if (arr[i] > arr[0]) {
                maxValue = arr[i];
            } else if (arr[i+1] < arr[0]) {
                minValue = arr[i];
            }
        }
        System.out.printf("최대값은 %d입니다.\n", maxValue);
        System.out.printf("최소값은 %d입니다.", minValue);
    }
}