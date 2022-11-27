// 백준 5597번
// X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
// 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q5_Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // 교실에 있는 학생 30명
        int[] student = new int[31];

        // 30명 학생의 번호 생성
        for (int i = 1; i < student.length; i++) {
            student[i] = i;
        }

        System.out.print("\n과제 제출자 : ");

        for (int j = 1; j < 29; j++) {
            student[input.nextInt()] = 100;
        }
        System.out.println(" ");

        // 과제 미제출 2명
        System.out.print("과제 미제출자 :");
        for (int k = 1; k < 31; k++) {
            if(!(student[k] == 100)){
                System.out.print(k + "번 ");
            }
        }
    }

}
