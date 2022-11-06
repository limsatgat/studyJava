import java.util.Scanner;

public class Subject {

    Scanner sc = new Scanner(System.in);

    double score = 0;

    // 입력받을 점수의 최대값과 최소값 제한
    static final double maxLength = 100;
    static final double minLength = 0;

    double inputScore(String subject) {
        System.out.print(subject + " 점수 : ");

        score = sc.nextDouble();

        while (score > maxLength || score < minLength) {
            System.out.print("점수를 잘못 입력하셨습니다. 다시 입력하십시요\n" + subject + " 점수 : ");
            score = sc.nextDouble();
        }
        return score;
    }

    // 과목의 합, 평균
    public double totalScore(double... n) {
        double sum = 0;
        for (int i=0; i<n.length; i++){
            sum += n[i];
        }
        return sum;
    }

    public double average(double... n) {
        return this.totalScore(n)/n.length;
    }

    public double[] test(double... n){
        double ts = this.totalScore(n);
        double ta = this.average(n);
        return new double[]{ts, ta};
    }

    public void a(int a, int b, String[] c) {
        c[0] = "" + a + b;

        System.out.println(c);
    }

   // Subject.class
    // java Subject "가", "나", "다"
    public static void main(String[] args) {
        Subject sub = new Subject();

        double koreanScore = 0, mathScore = 0, englishScore = 0;

        System.out.println("각 과목의 점수를 입력하시오.");

        koreanScore = sub.inputScore("국어");
        mathScore = sub.inputScore("수학");
        englishScore = sub.inputScore("영어");

    }
}
