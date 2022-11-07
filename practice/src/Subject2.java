import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Subject2 {
    HashMap<String, Double> subs = new HashMap<>();
    static final int maxLength = 100;
    static final int minLength = 0;
    int subLength;

    // 입력된 과목 숫자 파악하기
    void setSubLength(int length) {
        subLength = length;
    }

    boolean setSub(String subName, double score) {
        if (score >= minLength || score <= maxLength) {
            subs.put(subName, score);
        } else {
            System.out.println("점수는 0점 이상 100점 이하로 입력해주세요.");
            return false;
        }
        return true;
    }

    void checkSub() {
        Set<String> keySet = subs.keySet();
        for (String key : keySet) {
            System.out.println(key + " : " + subs.get(key));
        }
    }

    double getSum() {
        double sum = 0;
        Set<String> keySet = subs.keySet();
        for (String key : keySet) {
            sum += subs.get(key);
        }
        return sum;
    }

    double getAvg() {
        return getSum() / subLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Subject2 sub = new Subject2();
        System.out.println("과목의 개수를 입력해주세요.");
        sub.setSubLength(sc.nextInt());

        System.out.println("과목의 이름과 점수를 입력하시오.");
        for (int i = 1; i <= sub.subLength; i++) {
            System.out.println(i + "번째 과목입니다. 이름을 입력하고 엔터를 눌러주세요.");
            sub.setSub(sc.next(), sc.nextDouble());
        }

        sub.checkSub();
        System.out.printf("%.2f",sub.getAvg());
    }
}