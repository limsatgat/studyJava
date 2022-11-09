import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingExample extends JFrame implements ActionListener {

    // 2. implements를 해야 override 가능(중요)

    //"이 글자를 버튼을 누르면 text에 붙이시오"를 라벨과 textfiled에 새로 적어주는 버튼
    JButton b1 = new JButton("1");

    //글자하나를 지우는 기능으로 백스페이스 기능
    JButton b2 = new JButton("back");

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();

    JTextField t1 = new JTextField(30);

    JLabel l1 = new JLabel("이 글자를 버튼을 누르면 text에 붙이시오");
    JLabel l2 = new JLabel("");


    public SwingExample() {

        setLayout(new GridLayout(2, 1));
        p1.setLayout(new GridLayout(1, 2));
        p2.setLayout(new GridLayout(1, 2));

        add(p1);
        add(p2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        // 1. 위를 작성하고 앞부분 클릭하면 let implements가 있는 클릭하면 위쪽의 jframe옆에 자동생성됨
        p1.add(l1);
        p1.add(t1);

        p2.add(b1);
        p2.add(b2);

        setLocationRelativeTo(null);

        setSize(500, 500);

        setResizable(false);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        SwingExample test = new SwingExample();
    }

    // 3. 위쪽 부분의 implements를 클릭하면 add implements 를 통하여 자동생성가능
    // getAcitonCommand는 component의 text를 가져오는 기능
    // getSource는 component의 변수를 가지고옴
    @Override
    public void actionPerformed(ActionEvent e) {
        String a = e.getActionCommand();

        if (a == "1") {
            t1.setText("이 글자를 버튼을 누르면 text에 붙이시오");
            l1.setText("이 글자를 버튼을 누르면 text에 붙이시오");
        } else if (a == "back") {
            //"이 글자를 버튼을 누르면 text에 붙이시오"의 길이를 int로 나타내는 t
            //substring으로 문자를 짜르려고 t가 필요 저 문장 그대로 적으면 복잡하실까봐 t로 치환
            int t = l1.getText().length();

            if (t == 0) {        //글자가 없을 경우
                //마지막으로 한글자를 지우면 텍스트는 비는데 그때 또 backspace기능을 쓰면 당연히 length값이 0이므로 함수의 오류로가 된다. 그래서 length가 0일때는 그대로 빈칸""입력
                t1.setText("");
                l1.setText("");

            } else if (t > 0)   {   //글자가 있을 경우
                //l1의 글자를 끝에 하나를 자르는 substring 함수
                String b = l1.getText().substring(0, t - 1);

                //l1에도 한글자를 자른 문자를 넣는 이유는 지금은 hashlist등을 아직 강의 하지 않았으므로 메모리 기능이 없어 l1에 저장하였음
                t1.setText(b);
                l1.setText(b);
            } else {
                t1.setText("알수없는 오류");
            }
        }
    }
}

 