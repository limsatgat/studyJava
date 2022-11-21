import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

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

    LocalDate localDate = LocalDate.now();
    int year;
    Month month;

    // 생성자
    public CalendarSwing(){
        super("캘린더");
        year = localDate.getYear();
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
        localDate.of(year, month, 1);
        DayOfWeek week = localDate.getDayOfWeek();
//        System.out.println(week);
        int lastDay = localDate.lengthOfMonth();
//        System.out.println(lastDay);

        // 공백
        for (int i=0; i<week.getValue(); i++){
            JLabel empty = new JLabel(" ");
            dayPane.add(empty);
        }

        // 날짜추가 및 휴무일 지정
        for (int j = 1; j <= lastDay; j++){
            JLabel lbl = new JLabel(String.valueOf(j), JLabel.CENTER);
//            System.out.println(lbl);
            int weekend = localDate.getDayOfWeek();
            System.out.println(weekend);
//            if (weekend == 1) {
//                lbl.setForeground(Color.red);
//            } else if (weekend == 7){
//                lbl.setForeground(Color.blue);
//            }
            dayPane.add(lbl);
        }
    }

    // 요일세팅 (월,화,수,목,금,토,일) 및 휴무일 지정
    public void setCalendarTitle(){
        for (int i = 0; i < title.length; i++){
            JLabel dayOfWeek = new JLabel(title[i], JLabel.CENTER);
//            System.out.println(dayOfWeek);
            if (i == 0) {
                dayOfWeek.setForeground(Color.red);
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

    // 월 세팅
    public void setMonth(){
        for (int i =1; i<= 12; i++){
            monthComboBox.addItem(i);
        }
        monthComboBox.setSelectedItem(month);
    }

    // 날짜설정 콤보박스 이벤트
    public void itemStateChanged(ItemEvent e){

    }

    // 날짜이동 버튼 이벤트
    public void actionPerformed(ActionEvent ae){

    }

    // 콤보박스로 년/월 설정시 초기화
    private void setDayReset(){

    }

    // 월 이동(다음으로)
    public void nextMonth(){

    }

    // 월 이동(이전으로)
    public void prevMonth(){

    }

    public static void main(String[] args) {
        new CalendarSwing();
    }
}
