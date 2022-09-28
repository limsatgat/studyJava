public class Ex10_Enhanced_for {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // 일반 for문
        for(int i=0; i < arr.length; i++)   {
            System.out.println(arr[i]);
        }

        // 향상된 for문
//        for(int tmp : arr)  {
//            System.out.println(tmp);
//        }
    }
}