public class Ex06_doubleArray {
    public static void main(String[] args) {
        int[][] score = new int[][]{{100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}};
        int sum = 0;
        for(int var5 = 0; var5 < score.length; ++var5) {
            int[] tmp = score[var5];
            int[] var7 = tmp;
            int var8 = tmp.length;
            for(int var9 = 0; var9 < var8; ++var9) {
                int i = var7[var9];
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }

    static void su(int[][] score) {
        int sum = 0;
        for(int i = 0; i < score.length; ++i) {
            for(int j = 0; j < score[i].length; ++j) {
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
            }
        }
    }
}