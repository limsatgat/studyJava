public class Ex02_ArrayLengthChange {

    // 배열의 길이 변경
    public static void main(String[] args) {
        int[] arr = new int[4];

        for(int i = 0; i < 5; ++i) {
            arr[i] = i + 1;
        }

        System.out.println("[변경전]");
        System.out.println("arr.length : " + arr.length);

        for(int i = 0; i < arr.length; ++i) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }

        System.out.println();
        int[] tmp = new int[arr.length * 2];

        for(int i = 0; i < arr.length; ++i) {
            tmp[i] = arr[i];
        }

        arr = tmp;
        System.out.println("[변경후]");
        System.out.println("arr.length : " + tmp.length);

        for(int i = 0; i < arr.length; ++i) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }
    }
}
