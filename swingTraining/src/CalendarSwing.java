import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarSwing extends JFrame implements ItemListener, ActionListener {

    // 최상단
    JPanel selectPane = new JPanel();
    JButton prevBtn = new JButton("◀");
    JButton nextBtn = new JButton("▶");

    /* comboBox : - 콤보 박스는 리스트와 텍스트 필드가 결합된 형태로 보면 된다.
                  - 단, 텍스트 필드가 결합된 형태라 하더라도 수정할 수 없으며 선택 여부만 결정한다.*/
    JComboBox<Integer> yearComboBox = new JComboBox<Integer>();
    JComboBox<Integer> monthComboBox = new JComboBox<Integer>();

    JLabel yearLabel = new JLabel("년");
    JLabel monthLabel = new JLabel("월");

    // 중앙
    JPanel centerPane = new JPanel(new BorderLayout());
    JPanel titlePane = new JPanel(new GridLayout(1, 7));
    String[] title = {"일", "월", "화", "수", "목", "금", "토"};
    JPanel dayPane = new JPanel(new GridLayout(0, 7));

    LocalDate localDate;

    int year;
    Month month;

    // 생성자
    public CalendarSwing(){
        super("캘린더");
        // 2022 11 27
        localDate = LocalDate.now();

        // 2022
        year = localDate.getYear();

        // NOVEMBER
        month = localDate.getMonth();

        //상단바
        selectPane.add(prevBtn);
        selectPane.add(yearComboBox);
        selectPane.add(yearLabel);
        selectPane.add(monthComboBox);
        selectPane.add(monthLabel);
        selectPane.add(nextBtn);

        add(BorderLayout.NORTH, selectPane);

        setYear();
        setMonth();

        setCalendarTitle();
        centerPane.add(BorderLayout.NORTH, titlePane);
        add(centerPane);

        centerPane.add(dayPane);
        setDay();

        prevBtn.addActionListener(this);
        nextBtn.addActionListener(this);
        yearComboBox.addItemListener(this);
        monthComboBox.addItemListener(this);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    // 날짜 세팅
    public void setDay(){
        // 요일 세팅
        localDate = localDate.of(year, month, 1);
//        System.out.println(localDate.of(year, month, 1));

        // sunday
        DayOfWeek week = localDate.getDayOfWeek();

        // 이번달의 마지막 일/ 30
        int lastDay = localDate.lengthOfMonth();

        // 공백
        for (int i=0; i<week.getValue(); i++){
            JLabel empty = new JLabel(" ");
            dayPane.add(empty);
        }

        // 날짜추가 및 휴무일 지정
        for (int j = 1; j <= lastDay; j++){
            JLabel lbl = new JLabel(String.valueOf(j), JLabel.CENTER);
//            System.out.println(lbl);
            DayOfWeek weekend = localDate.getDayOfWeek();   // 현재 요일
            weekend = weekend.plus(j-1);
//            System.out.println(weekend);

            switch (String.valueOf(weekend)) {
                // 일요일일 때 빨강
                case "SUNDAY":
//                    System.out.println(0);
                    lbl.setForeground(Color.red);
                    break;
                // 토요일일 때 파랑
                case "SATURDAY":
//                    System.out.println(6);
                    lbl.setForeground(Color.blue);
                    break;
            }
            dayPane.add(lbl);
        }
    }

    // 요일세팅 (월,화,수,목,금,토,일) 및 휴무일 지정
    public void setCalendarTitle(){
        for (int i = 0; i < title.length; i++){
            JLabel dayOfWeek = new JLabel(title[i], JLabel.CENTER);
//            System.out.println(dayOfWeek);
            // 일요일일 때 빨강
            if (i == 0) {
                dayOfWeek.setForeground(Color.red);
            // 토요일일 때 파랑
            } else if (i == 6) {
                dayOfWeek.setForeground(Color.blue);
            }
            titlePane.add(dayOfWeek);
        }
    }

    // 년도 세팅
    public void setYear(){
        for (int i = year - 52; i < year + 28; i++){
            yearComboBox.addItem(i);
        }
        yearComboBox.setSelectedItem(year);
    }

    // 월 세팅 (1~12)
    public void setMonth(){
        for (int i =1; i<= 12; i++){
            monthComboBox.addItem(i);
        }
        monthComboBox.setSelectedItem(month.getValue());
    }

    // 날짜설정 콤보박스 이벤트
    public void itemStateChanged(ItemEvent e){
        year = (int) yearComboBox.getSelectedItem();
        month = Month.of(Integer.parseInt(String.valueOf(monthComboBox.getSelectedItem())));

        dayPane.setVisible(false);
        dayPane.removeAll();
        setDay();
        dayPane.setVisible(true);
    }

    // 날짜이동 버튼 이벤트
    public void actionPerformed(ActionEvent ae){
        String moveCal = ae.getActionCommand();
//        System.out.println(moveCal);
        switch (moveCal){
            case "◀" :
               prevMonth();
               setDayReset();
               break;
            case "▶" :
                nextMonth();
                setDayReset();
                break;
//        Object obj = ae.getSource();
//        if(obj == prevBtn){
//            prevMonth();
//            setDayReset();
//        } else if (obj == nextBtn){
//            nextMonth();
//            setDayReset();
        }
    }



    // 콤보박스로 년/월 설정시 초기화
    private void setDayReset(){
        yearComboBox.removeItemListener(this);
        monthComboBox.removeItemListener(this);

        yearComboBox.setSelectedItem(year);
//        System.out.println(year);
        monthComboBox.setSelectedItem(month.getValue());
//        System.out.println(month);

        dayPane.setVisible(false);
        dayPane.removeAll();
        setDay();
        dayPane.setVisible(true);

        yearComboBox.addItemListener(this);
        monthComboBox.addItemListener(this);
    }

    // 월 이동(이전으로)
    public void prevMonth(){
        month = month.minus(1);
//        System.out.println(month.minus(1));

        if (String.valueOf(month) == "JANUARY"){
            year--;
        }
    }

    // 월 이동(다음으로)
    public void nextMonth(){
        month = month.plus(1);

        if (String.valueOf(month) == "JANUARY"){
            year++;
        }
    }

    public static void main(String[] args) {
        new CalendarSwing();
    }
}
