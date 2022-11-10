import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MyDialog extends JDialog{


    JTextField tf = new JTextField("아이디입력",10);
    JButton okButton = new JButton("OK");

    MyDialog(JFrame frame){
        super(frame, "다이알로그입니다",true);//끝에 true를 넣으면 modal이 됨
        //다이알로그는 Frame이 소유함, 소유권자가 있어야함(null가능)
        setLayout(new FlowLayout());
        add(tf);
        add(okButton);
        setBounds(100,100,200,100);

        //다이얼로그 버튼에 액션리스너 붙이기, 이벤트 처리 위함
        //원래 생성한 객체를 addActionListener()안에 넣어야 하지만 익명중첩클래스사용
        okButton.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        setVisible(false);// 다이알로그의 오케이버튼 누르면 창 안보이는 이벤트

                    }
                }
        );

    }

}



public class SwingSample3 extends JFrame{


    JButton btn = new JButton("다이얼로그 보여줘");
    MyDialog dialog;

    public SwingSample3(){
        super("부모JFrame");
        setBounds(250,200,400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dialog = new MyDialog(this);
        getContentPane().add(btn);//컨텐트 페인 얻어서 붙이는것과 같은 코드

        //버튼에 액션리스너 붙이기, 이벤트 처리 위함
        //원래 생성한 객체를 addActionListener()안에 넣어야 하지만 익명중첩클래스사용
        btn.addActionListener(
                new ActionListener() {// 익명중첩클래스사용,오버라이딩
                    public void actionPerformed(ActionEvent e) {
                        dialog.setVisible(true);//다이알로그를 보이게하는 이벤트
                    }
                }
        );


        setVisible(true);
    }






    //테스트위한 메인함수
    public static void main(String[] args) {

        new SwingSample3();

    }

}