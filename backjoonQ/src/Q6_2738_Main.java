import java.util.Scanner;

// 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
// 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

public class Q6_2738_Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // N행
        int N = input.nextInt();
        if (!(N <= 100)){
            System.out.println("프로그램이 종료됩니다.");
            input.close();
        }

        // M열
        int M = input.nextInt();
        if (!(M <= 100)){
            System.out.println("프로그램이 종료됩니다.");
            input.close();
        }

        // 행렬 A
        int[][] A = new int[N][M];
    }
}
