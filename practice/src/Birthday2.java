// 생년월일을 입력했을 때, 60갑자와 요일 출력
// month, heaven, earth년
// 1994년 4월 2일 = 토요일, 갑술

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Birthday2 {
    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        // 천간, 지지
        char[] heavenGroup = {'경', '신', '임', '계', '갑', '을', '병', '정', '무', '기'};
        char[] earthGroup = {'신', '유', '술', '해', '자', '축', '인', '묘', '진', '사', '오', '미'};

        System.out.println("생년월일 8자리를 입력하면 육십갑자와 요일이 출력됩니다. ex) 1999년1월1일");
        StringBuilder birth = new StringBuilder(inputValue.next());

        while (birth.length() != 9 || !(birth.substring(4, 5).equals("년") || birth.substring(6, 7).equals("월") || birth.substring(8, 9).equals("일"))) {
            System.out.println("입력값이 바르지 않습니다. ex) 1999년1월1일");
            birth = new StringBuilder(inputValue.next());
        }

        // 맨 마지막 문장 '일' 제거
        birth = birth.replace(8, 9, "");

        // 년을 0으로 대체
        if (Integer.parseInt(birth.substring(5, 6)) < 10) {
            birth = birth.replace(4, 5, "0");
        }

        // 월을 0으로 대체
        if (Integer.parseInt(birth.substring(7, 8)) < 10) {
            birth = birth.replace(6, 7, "0");
        }

        String year = birth.substring(0, 4);

        // 천간 : 연도를 10으로 나눴을 때의 나머지값
        int heaven = Integer.parseInt(year) % 10;

        // 지지 : 연도를 12로 나눴을 때의 나머지값
        int earth = Integer.parseInt(year) % 12;

        // 입력한 값에서 년,월,일 나눠 가져오기
        int inputYear = Integer.parseInt(year);
        int month = Integer.parseInt(birth.substring(5, 6));
        int day = Integer.parseInt(birth.substring(7, 8));

        // 1. LocalDate 생성
        LocalDate date = LocalDate.of(inputYear, month, day);

        // 2. DayOfWeek 객체 구하기
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String dayOfTheWeek = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);  // 토요일
        System.out.println("귀하께서는 " + heavenGroup[heaven] + earthGroup[earth] + "년 " + dayOfTheWeek + "에 태어나셨습니다.");
    }
}