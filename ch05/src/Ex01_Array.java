public class Ex01_Array {

    public static void main(String[] args) {
        int[][][] score = new int[5][3][3];
        int k = 1;

        score[0][0][0] = 50;
        score[1][0][0] = 60;
        score[2][0][0] = 70;
        score[3][0][0] = 80;
        score[4][0][0] = 90;

        System.out.println(score.length);
//        int tmp = score[k + 2] + score[4];

//        for(int i = 0; i < 5; ++i) {
//            System.out.printf("score[%d]:%d%n", i, score[i]);
//        }

        // Array.length 사용
//        for(int i = 0; i < score.length; ++i) {
//            System.out.println(score[i]);
//        }

//        System.out.printf("tmp : %d%n", tmp);
    }
}
