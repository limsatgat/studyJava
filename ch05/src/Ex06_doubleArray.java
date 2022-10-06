public class Ex06_doubleArray {

    // 2차원 배열
    public static void main(String[] args) {
        int[][] score = new int[][]{{100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}};
        int sum = 0;

        int j;
        for(int i = 0; i < score.length; ++i) {
            for(j = 0; j < score[i].length; ++j) {
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
            }
        }

        int[][] var11 = score;
        j = score.length;

        for(int var5 = 0; var5 < j; ++var5) {
            int[] tmp = var11[var5];
            int[] var7 = tmp;
            int var8 = tmp.length;

            for(int var9 = 0; var9 < var8; ++var9) {
                int i = var7[var9];
                sum += i;
            }
        }

        System.out.println("sum = " + sum);
    }
}