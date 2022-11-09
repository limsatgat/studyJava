import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class SwingSample extends JFrame implements ActionListener{
    JButton btnCopy = new JButton("복사");
    JButton btnPaste = new JButton("붙여넣기");
    JButton btnCut = new JButton("잘라내기");
    JButton btnDel = new JButton("삭제");

    JTextArea txtMemo = new JTextArea("", 10, 30);
    String copyText;

    public SwingSample() {
        super("제목 없음 - 메모장");

        initLayout();

        setBounds(200,200,400,320);
        setVisible(true);

        addWindowListener((WindowListener) new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {
                int re = JOptionPane.showConfirmDialog(SwingSample.this,  "정말 종료할까요?" , "종료", JOptionPane.YES_NO_OPTION);
                if(re == JOptionPane.YES_OPTION)
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                else
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            }
        });
    }

    private void initLayout() {
        JPanel pn = new JPanel();
        pn.add(btnCopy);
        pn.add(btnPaste);
        pn.add(btnCut);
        pn.add(btnDel);

        add("South", pn);
        JScrollPane ScrollPane = new JScrollPane(txtMemo);
        add("Center", txtMemo);

        btnCopy.addActionListener(this);
        btnPaste.addActionListener(this);
        btnCut.addActionListener(this);
        btnDel.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnCopy) { // 복사 작업
            copyText = txtMemo.getSelectedText();
        }else if(e.getSource() == btnPaste) { // 붙여넣기
            int position = txtMemo.getCaretPosition();
            txtMemo.insert(copyText, position);
        }else if(e.getSource() == btnCut) {
            copyText = txtMemo.getSelectedText();

            int start = txtMemo.getSelectionStart();
            int end = txtMemo.getSelectionEnd();
            txtMemo.replaceRange("", start, end);
        }else if(e.getSource() == btnDel) { //삭제
            int start = txtMemo.getSelectionStart();
            int end = txtMemo.getSelectionEnd();
            txtMemo.replaceRange("",start,end);
        }

        txtMemo.requestFocus();

    }

    public static void main(String[] args) {
        new SwingSample();
    }
}