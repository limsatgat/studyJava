public class S07_RightStairStar {

    public static void main(String[] args) {

        //     *
        //    **
        //   ***
        //  ****
        // *****

        for (int i = 1; i < 6; i++){
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
