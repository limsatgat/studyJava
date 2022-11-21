import java.util.Scanner;

// 백준 10871번
// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

public class Q2_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("임의의 정수 N을 입력하시오");
        int N = input.nextInt();

        // N개로 이루어진 수열 A
        int A[] = new int[N];

        // N개를 입력한만큼 배열에 넣기
        System.out.println("배열에 들어갈 숫자를 \'" + N + "\'개 입력하세요");
        for(int i=0; i<N; i++){
            A[i] = input.nextInt();
        }

        System.out.println("비교할 대상인 정수 X를 입력하세요.");
        int X = input.nextInt();
        for(int i=0; i<A.length; i++){
            if(X > A[i]){
                System.out.println(A[i]);
            }
        }
    }
}
