public class training {

    public static void main(String[] args) {
        // *****
        for (int i=1; i<=5; i++){
            System.out.print("*");
        }

        System.out.println("\n");   // 여백

        // *
        // *
        // *
        // *
        // *
        for (int i=1; i<=5; i++){
            System.out.println("*");
        }

        System.out.println();   // 여백

        // *****
        //  ****
        //   ***
        //    **
        //     *
        for (int i=0; i<=4; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();   // 여백

        // *
        // **
        // ***
        // ****
        // *****
        for (int i=1; i<=5; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();   // 여백

        // *****
        // ****
        // ***
        // **
        // *
        for (int i=1; i<=5; i++){
            for (int j=6; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();   // 여백

        //     *
        //    **
        //   ***
        //  ****
        // *****
        for (int i=1; i<=5; i++){
            for (int j=5; j>i; j--){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();   // 여백

//        //     *
//        //    ***
//        //   *****
//        //  *******
//        // *********
        for (int i=1; i<10; i+=2){
            for (int j=9; j>i; j-=2){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();   // 여백

        // *********
        //  *******
        //   *****
        //    ***
        //     *
        for (int i=1; i<10; i+=2){
            for (int j=1; j<i; j+=2){
                System.out.print(" ");
            }
            for (int j=10; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();   // 여백
    }
}