public class Ex04_useArray {

    // 배열 활용하기
    public static void main(String[] args) {
        float sum = 0.0f;
        float average = 0.0F;
        float[] score = new float[]{100, 88.5f, 100, 100, 90};

        for(int i = 0; i < score.length; ++i) {
            sum += score[i];
        }

        average = sum / (float)score.length;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }
}
