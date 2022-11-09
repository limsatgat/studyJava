
import sun.util.resources.cldr.rof.CalendarData_rof_TZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing extends JFrame {
    public Swing() {
        setTitle("발전하는 임스윙스");
        setSize(600, 400);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // 복사된 문자 저장


        // 텍스트 입력창
        JTextField inputArea = new JTextField("", 50);

        JPanel button = new JPanel();

        // 복사버튼을 누르면 inputArea의 값이 담김
        JButton jClone = new JButton("복사");
        jClone.addActionListener(e -> {
            inputArea.getText();
        });

        String textArea = inputArea.getText();

        // 붙여넣기
        JButton jPaste = new JButton("붙여넣기");
        jPaste.addActionListener(e -> {
            inputArea.setText(textArea);
        });

        // 삭제버튼
        JButton jCut = new JButton("삭제");
        jCut.addActionListener(e -> {
            inputArea.setText("");
        });

        // 글바꾸기버튼
        JButton jChange = new JButton("글바꾸기");
        jChange.addActionListener(e -> {

        });

        c.add(inputArea);
        c.add(button);

        button.add(jClone);
        button.add(jPaste);
        button.add(jCut);
        button.add(jChange);

        // 닫기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Swing();
    }
}