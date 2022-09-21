public class S09_MirrorStairStar {

    public static void main(String[] args) {

        // *****
        // ****
        // ***
        // **
        // *
        // **
        // ***
        // ****
        // *****

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
