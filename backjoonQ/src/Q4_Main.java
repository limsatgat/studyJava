// 백준 2562번
// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
// 예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61 이 주어지면,
// 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

public class Q4_Main {
    public static void main(String[] args) {

        int[] arr = new int[9];
        int maxRandom = arr[0];

        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random() * 100) + 1;
            System.out.print(arr[i] + ",");

            if (arr[i] > arr[0]){
                maxRandom = arr[i];
            }
        }
        System.out.printf("\n임의의 자연수 중 최대값은 %d입니다.", maxRandom);
    }
}
