import javax.swing.*;
import java.awt.*;
import java.lang.String;

public class Swing extends JFrame {

    // 복사한 값이 저장된 클립보드
    StringBuilder textContent = new StringBuilder();

    // 입력창
    JTextField inputArea = new JTextField("", 50);

    // 버튼 공간과 아이들
    JPanel button = new JPanel();
    JButton jClone = new JButton("복사");
    JButton jPaste = new JButton("붙여넣기");
    JButton jCut = new JButton("삭제");
    JButton jChange = new JButton("글바꾸기");

    // 글바꾸기 할 때 기존 글 저장
    static StringBuilder inputText = new StringBuilder();

    public Swing() {
        setTitle("발전하는 임스윙스");
        setSize(600, 400);

        Container writeBox = getContentPane();
        writeBox.setLayout(new FlowLayout());

        ChangeDialog ChangeModal = new ChangeDialog(this);
//        // 복사된 문자 저장
//        StringBuilder textContent = new StringBuilder();
//
//        // 텍스트 입력창
//        JTextField inputArea = new JTextField("", 50);

//        JPanel button = new JPanel();

        // 복사버튼을 누르면 inputArea의 값이 담김
//        JButton jClone = new JButton("복사");
        jClone.addActionListener(e -> {
            if (textContent.length() == 0) {
                textContent.append(inputArea.getText());
            } else {
                textContent.setLength(0);
                textContent.append(inputArea.getText());
            }
            JOptionPane.showMessageDialog(writeBox, "복사되었습니다");
        });

        // 붙여넣기
//        JButton jPaste = new JButton("붙여넣기");
        jPaste.addActionListener(e -> {
            inputArea.setText(inputArea.getText() + String.valueOf(textContent));
        });

        // 삭제버튼
//        JButton jCut = new JButton("삭제");
        jCut.addActionListener(e -> {
            inputArea.setText("");
        });

        // 글바꾸기버튼
//        JButton jChange = new JButton("글바꾸기");
        jChange.addActionListener(e -> {
            if (inputArea.getText().length() != 0) {
                inputText.append(inputArea.getText());
                ChangeModal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(writeBox, "입력된 내용이 없습니다.");
            }
        });

        writeBox.add(button);

        button.add(inputArea);
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

class ChangeDialog extends JDialog {

    JLabel beforeLabel = new JLabel("변경될 문자");
    JLabel afterLabel = new JLabel("변경할 문자");

    JTextField before = new JTextField("", 20);
    JTextField after = new JTextField("", 20);

    JButton allChange = new JButton("전체");
    JButton firstChange = new JButton("처음");
    JButton cancel = new JButton("취소");

    StringBuilder inputText = Swing.inputText;

    String changeText = String.valueOf(inputText);

    ChangeDialog(JFrame frame) {
        super(frame, "글바꾸기", true);
        Container changeBox = getContentPane();
        changeBox.setLayout(new FlowLayout());

        // 프레임에 기능 추가
        add(beforeLabel);
        add(before);
        add(afterLabel);
        add(after);
        add(allChange);
        add(firstChange);
        add(cancel);
        setBounds(100, 100, 300, 200);

        // 글 변경
        allChange.addActionListener(e -> {

            // 넘어온 값을 확인하고 변경해서 넘기기
            // 변경 후에 넘어온 원글 값이랑 맞는지 확인하고 넘기기
            if (after.getText().length() != 0 && before.getText().length() != 0) {

                changeText = String.valueOf(inputText);

                // 기존의 값과 입력 값 확인
                if (changeText.toLowerCase().contains(before.getText().toLowerCase())) {

                    System.out.println(before.getText());
                    System.out.println(after.getText());

                    // 일치하면 after.getText() 로 내용변경
                    changeText = changeText.replace(before.getText(), after.getText());
                    System.out.println(changeText);
                    JOptionPane.showMessageDialog(changeBox, "변경되었습니다");
                    ChangeDialog.this.setVisible(false);
                    after.setText("");
                    before.setText("");
                    JButton.
                } else {
                    JOptionPane.showMessageDialog(changeBox, "내용이 일치하지 않습니다.");
                }
            } else {
                JOptionPane.showMessageDialog(changeBox, "변경 내용이 없습니다.");
            }
        });

        // 첫글만 변경
        // 글 변경
        firstChange.addActionListener(e -> {

            // 넘어온 값을 확인하고 변경해서 넘기기
            // 변경 후에 넘어온 원글 값이랑 맞는지 확인하고 넘기기
            if (after.getText().length() != 0 && before.getText().length() != 0) {

                changeText = String.valueOf(inputText);

                // 기존의 값과 입력 값 확인
                if (changeText.toLowerCase().contains(before.getText().toLowerCase())) {

                    System.out.println(before.getText());
                    System.out.println(after.getText());

                    // 일치하면 after.getText() 로 내용변경
//                    changeText.replaceAll("\"" + before.getText() + "\"" , "\"" + after.getText() + "\"");
                    changeText = changeText.replaceFirst(before.getText(), after.getText());
                    System.out.println(changeText);
                    JOptionPane.showMessageDialog(changeBox, "변경되었습니다");
                    ChangeDialog.this.setVisible(false);
                    after.setText("");
                    before.setText("");
                } else {
                    JOptionPane.showMessageDialog(changeBox, "내용이 일치하지 않습니다.");
                }
            } else {
                JOptionPane.showMessageDialog(changeBox, "변경 내용이 없습니다.");
            }
        });
        // 취소 버튼
        cancel.addActionListener(e -> {
            ChangeDialog.this.setVisible(false);
        });
    }
}