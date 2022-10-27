import java.util.Scanner;

// 매개변수의 다형성
class CellularPhone {
    String payName;

    CellularPhone(String payName) {
        this.payName = payName;
    }
}

class Galaxy extends CellularPhone {
    // 부모클래스의 생성자를 호출
    Galaxy() {
        super("삼성페이");
    }

    public String toString() {
        return payName;
    }
}

class iPhone extends CellularPhone {
    iPhone() {
        super("애플페이");
    }

    public String toString() {
        return payName;
    }
}

class User {
    void payment(Galaxy ga) {
        System.out.print(ga);
    }

    void payment(iPhone ip) {
        System.out.print(ip);
    }

//    void payment(CellularPhone cp){
//        System.out.print(cp);
//    }
}

public class Ex10_ParameterPoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("결제수단을 선택해주세요 : 페이 / 카드 / 현금");
        String pay = sc.next();

        User user = new User();
        Galaxy s20 = new Galaxy();
        iPhone i13 = new iPhone();

        if (pay.equals("페이")) {
            System.out.print("선택된 결제 수단은 ");
            user.payment(s20);
            System.out.print("와 ");
            user.payment(i13);
            System.out.println(" 입니다.");
            System.out.println("앱을 실행한 상태로 투입구에 부착바랍니다.");
        } else if (pay.equals("카드") || pay.equals("현금")) {
            System.out.println("투입구에 넣어주시기 바랍니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
