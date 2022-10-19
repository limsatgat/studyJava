class Human{
    String name;
    int height;

    // 매개변수를 받는 생성자
    Human(String name, int height){
        this.name = name;
        this.height = height;
    }
}

class Info extends Human{
    int age;

    // 매개변수를 받는 생성자 (오버로딩)
    Info(String name, int height, int age){
        super(name, height);    // 부모 생성자 호출
        this.age = age;
    }
}

public class Ex05_SuperConstructor {
    public static void main(String[] args) {
        Info info = new Info("임수헌", 175, 29);   // 매개변수 전달
        System.out.println("이름 : " + info.name);
        System.out.println("키 : " + info.height);
        System.out.println("나이 : " + info.age);
    }
}
