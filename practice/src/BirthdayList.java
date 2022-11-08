// 생년월일을 입력했을 때, 60갑자와 요일 출력
// month, heaven, earth년
// 1994년 4월 2일 = 토요일, 갑술

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;

public class BirthdayList {
    public static void main(String[] args){
        boolean flag = true;
        try {
            while (flag) {
                flag = new BirthdayList().question();
            }
        } catch (InputMismatchException input){
            System.out.println("숫자 이외의 값이 입력되었습니다.");
            System.out.println("***********************************");
            new BirthdayList().question();
        } catch (DateTimeException date){
            System.out.println("날짜형식에 맞지않는 값이 입력되었습니다.");
            System.out.println("***********************************");
            new BirthdayList().question();
        } catch (Exception e){
            System.out.println("다시 입력바랍니다.");
            new BirthdayList().question();
        }
    }

    public boolean question() {
        Scanner inputValue = new Scanner(System.in);

        // 천간, 지지
        ArrayList<String> sky = new ArrayList<>(Arrays.asList("경","신","임","계","갑","을","병","정","무","기"));
        ArrayList<String> ground = new ArrayList<>(Arrays.asList("신","유","술","해","자","축","인","묘","진","사","오","미"));

        System.out.println("생년월일 8자리를 입력하면 육십갑자와 요일이 출력됩니다. ex) 19990909");
        String birth = Integer.toString(inputValue.nextInt());
        String year = birth.substring(0, 4);

        while (birth.length() != 8){
            System.out.println("입력가능한 글자보다 적거나 많습니다. 다시 입력바랍니다. ex)19990909");
            birth = Integer.toString(inputValue.nextInt());
        }
        // 천간 : 연도를 10으로 나눴을 때의 나머지값
        int sixty = Integer.parseInt(year)% 10;

        // 지지 : 연도를 12로 나눴을 때의 나머지값
        int ganzi = Integer.parseInt(year)% 12;

        // 입력한 값에서 년,월,일 나눠 가져오기
        int inputYear = Integer.parseInt(year);
        int month = Integer.parseInt(birth.substring(4, 6));
        int day = Integer.parseInt(birth.substring(6, 8));

        // 1. LocalDate 생성
        LocalDate date = LocalDate.of(inputYear, month, day);

        // 2. DayOfWeek 객체 구하기
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String birthMonth = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);  // 토요일
        System.out.println("귀하께서는 " + sky.get(sixty) + ground.get(ganzi) + "년 " + birthMonth + "에 태어나셨습니다.");

        System.out.println("다시 입력하시겠습니까? Y:예, N:아니오");
        String ask = inputValue.next();
        if (ask.equalsIgnoreCase("N")  || ask.equals("아니오")) {
            System.out.println("질문이 종료됩니다.");
            inputValue.close();
            return false;
        } else {
            return true;
        }
    }
}