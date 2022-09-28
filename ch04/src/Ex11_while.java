public class Ex11_while {

    public static void main(String[] args) {

//        for (int i=5; i!=0; i--){
//            System.out.println(i);
//        }

        // 예시 1번
        int i = 5;
        while(i-- != 0)   {
            System.out.println(i + " - I can do it.");
        }
        System.out.println();

        // 예시 2번
        int sum = 0;
        int j = 0;
        while((sum += ++j) <= 100){
            System.out.printf("%d - %d%n", j, sum);
        }
    }
}