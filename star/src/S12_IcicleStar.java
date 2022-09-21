public class S12_IcicleStar {

    public static void main(String[] args) {

        // *********
        //  *******
        //   *****
        //    ***
        //     *

        for (int i = 1; i < 10; i+=2) {
            for (int j = 1; j < i; j+=2) {
                System.out.print(" ");
            }
            for (int j = 10; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
