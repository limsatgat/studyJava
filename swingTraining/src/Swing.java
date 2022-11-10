
import sun.util.resources.cldr.rof.CalendarData_rof_TZ;

import javax.swing.*;
import java.awt.*;
import java.lang.String;
public class Swing extends JFrame {
    public Swing() {
        setTitle("발전하는 임스윙스");
        setSize(600, 400);

        Container writeBox = getContentPane();
        writeBox.setLayout(new FlowLayout());

        ChangeDialog ChangeModal = new ChangeDialog(this);

        // 복사된 문자 저장
        StringBuilder textContent = new StringBuilder();

        // 텍스트 입력창
        JTextField inputArea = new JTextField("", 50);

        JPanel button = new JPanel();

        // 복사버튼을 누르면 inputArea의 값이 담김
        JButton jClone = new JButton("복사");
        jClone.addActionListener(e -> {
            if(textContent.length() == 0) {
                textContent.append(inputArea.getText());
            } else {
                textContent.setLength(0);
                textContent.append(inputArea.getText());
            }
            JOptionPane.showMessageDialog(writeBox, "복사되었습니다");
        });

        // 붙여넣기
        JButton jPaste = new JButton("붙여넣기");
        jPaste.addActionListener(e -> {
            inputArea.setText(inputArea.getText() + String.valueOf(textContent));
        });

        // 삭제버튼
        JButton jCut = new JButton("삭제");
        jCut.addActionListener(e -> {
            inputArea.setText("");
        });

        // 글바꾸기버튼
        JButton jChange = new JButton("글바꾸기");
        jChange.addActionListener(e -> {
            ChangeModal.setVisible(true);
        });

        writeBox.add(inputArea);
        writeBox.add(button);

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

class ChangeDialog extends JDialog{
    JLabel beforeText = new JLabel("변경될 문자");
    JLabel afterText = new JLabel("변경할 문자");

    JTextField before = new JTextField("",20);
    JTextField after = new JTextField("", 20);

    JButton confirm = new JButton("확인");
    JButton cancel = new JButton("취소");

    ChangeDialog(JFrame frame){
        super(frame, "글바꾸기", true);
        Container changeBox = getContentPane();
        changeBox.setLayout(new FlowLayout());
        add(beforeText);
        add(before);
        add(afterText);
        add(after);
        add(confirm);
        add(cancel);
        setBounds(100,100,300,200);

        // 확인 버튼
        confirm.addActionListener(e -> {
            JOptionPane.showMessageDialog(changeBox, "변경되었습니다");

        });

        // 취소 버튼
        cancel.addActionListener(e -> {
        });
    }

}