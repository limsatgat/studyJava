import java.util.Scanner;

// 백준 10818번
// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

public class Q3_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 주어진 N개의 정수
        int N = input.nextInt();
        // 정수를 담을 arr 배열
        int arr[] = new int[N];

        System.out.println("배열에 들어갈 숫자를 \'" + N + "\'개 입력하세요");
        for(int i=0; i<N; i++) {
            arr[i] = input.nextInt();

            for(int j=0; j<arr.length; j++){

                // 최대값

                // 최소값
            }
        }
    }
}
