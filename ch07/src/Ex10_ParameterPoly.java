import java.util.Scanner;

// 매개변수의 다형성
class CellularPhone {
    String payName;
    CellularPhone(String payName){
        this.payName = payName;
    }

    CellularPhone(){};
}

class Galaxy extends CellularPhone {
    Galaxy(){
        super("삼성페이");
    }
    public String toString(){
        return "삼성페이";
    }
}

class iPhone extends CellularPhone {
    iPhone(){
        super("애플페이");
    }
    public String toString(){
        return "애플페이";
    }
}

class User {
    void use(CellularPhone cp){
    }
}

public class Ex10_ParameterPoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Galaxy 와 iPhone 중 결제수단을 정해주세요.");

        User user = new User();
        user.use(new Galaxy());
        user.use(new iPhone());

        String pay = sc.next();
        if(pay.equals("Galaxy")) {
            System.out.println();
        } else if (pay.equals("iPhone")) {
            System.out.println();
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
