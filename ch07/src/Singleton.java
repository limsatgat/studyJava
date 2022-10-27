// 예시 - 싱글톤 패턴
public class Singleton {

    // 내부적으로 객체를 생성하고 외부에서 필드값을 수정하지 못하도록 private
    // 2. private static 인스턴스 변수
    private static Singleton instance = new Singleton();

    // 외부에서 생성자를 호출할 수 없게 private
    // 1. private 생성자
    private Singleton() {
        System.out.println("인스턴스를 생성하였습니다.");
    }  // 생성자

    // 외부에서 객체를 얻을 수 있게하는 메소드의 리턴문으로, public(어디서든 접근)과 static
    // 3. instance를 받을 메소드
    public static Singleton getInstance() {
        // 최초로 한 번 불려질 때 null 값이면 객체 생성
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}  // 클래스 내부

class Test{
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().toString());
    }
}