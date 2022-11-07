// 생년월일을 입력했을 때, 60갑자와 요일 출력
// month, heaven, earth년
// 1994년 4월 2일 = 토요일, 갑술

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args){

        Scanner inputValue = new Scanner(System.in);

        // 천간, 지지
        char[] heavenGroup = {'경','신','임','계','갑','을','병','정','무','기'};
        char[] earthGroup = {'신','유','술','해','자','축','인','묘','진','사','오','미'};

        System.out.println("생년월일 8자리를 입력하면 육십갑자와 요일이 출력됩니다. ex) 19990909");
        String birth = Integer.toString(inputValue.nextInt());
        String year = birth.substring(0, 4);

        while (birth.length() != 8){
            System.out.println("입력가능한 글자를 초과하였습니다. 다시 입력바랍니다.");
            birth = Integer.toString(inputValue.nextInt());
        }

        // 천간 : 연도를 10으로 나눴을 때의 나머지값
        int heaven = Integer.parseInt(year)% 10;

        // 지지 : 연도를 12로 나눴을 때의 나머지값
        int earth = Integer.parseInt(year)% 12;

        // 입력한 값에서 년,월,일 나눠 가져오기
        int inputYear = Integer.parseInt(year);
        int month = Integer.parseInt(birth.substring(5, 6));
        int day = Integer.parseInt(birth.substring(7, 8));

        // 1. LocalDate 생성
        LocalDate date = LocalDate.of(inputYear, month, day);

        // 2. DayOfWeek 객체 구하기
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String birthMonth = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);  // 토요일
        System.out.println("귀하께서는 " + heavenGroup[heaven] + earthGroup[earth] + "년 " + birthMonth + "에 태어나셨습니다.");
    }
}