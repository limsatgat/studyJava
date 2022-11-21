import java.util.Scanner;

// 백준 10807번
//총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

public class Q1_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 주어진 정수(자릿수) N개
        System.out.println("총 N개의 배열을 생성하겠습니다.");
        int N = input.nextInt();

        // 무작위로 주어진 N개의 값을 담을 배열
        int arr[] = new int[N];

        // 무작위 배열 입력
        System.out.println("배열에 넣을 숫자를 무작위로 입력하세요.");
        for (int i=0; i<N; i++){
            arr[i] = input.nextInt();
        }

        // 구하려는 정수 v
        System.out.println("배열안에서 찾을 숫자를 입력하세요.");
        int v = input.nextInt();
        // v의 총 개수
        int count = 0;

        for (int i=0; i<arr.length; i++){
            if (v==arr[i]){
                count ++;
            }
        }

        System.out.println("찾으시려는 \'" + v + "\' 의 개수는 " + count + "개 입니다.");

    }
}
