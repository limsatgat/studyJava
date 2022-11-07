import java.util.Arrays;
import java.util.Scanner;

public class Ex02_ExceptionHandling {


    public double total(String[] subject){

        Scanner sc = new Scanner(System.in);

        double sum = 0;

        for(int i=0; i<subject.length; i++){
            System.out.println(subject[i] + "점수를 입력해주세요.");
            double score = sc.nextDouble();
            sum += score;
        }
        return sum/subject.length;
    }

    public static void main(String[] args) {
        /*Ex02_ExceptionHandling ex = new Ex02_ExceptionHandling();
        ex.total(new String[] {"국어", "영어", "수학" });
*/
        Subject s = new Subject();
//        double[] test = s.test(10.0, 20.0, 30.0, 40.0, 50.0);
//        System.out.println(Arrays.toString(test));
        String[] c = new String[]{};
        s.a(1,2, c);
        System.out.println("이 이거 : "+ c[0]);
    }

}
