public class Ex04_useArray {
    public Ex04_useArray() {
    }

    public static void main(String[] args) {
        int sum = 0;
        float average = 0.0F;
        int[] score = new int[]{100, 88, 100, 100, 90};

        for(int i = 0; i < score.length; ++i) {
            sum += score[i];
        }

        average = (float)sum / (float)score.length;
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }
}
