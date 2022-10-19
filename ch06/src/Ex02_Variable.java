public class Ex02_Variable {
    // 클래스 변수와 인스턴스 변수
    public static void main(String[] args) {
        System.out.println("생닭 규격 = " + Chicken.size + "호");

        Chicken chicken = new Chicken();
        chicken.sauce = "양념";
        chicken.drink = "제로콜라";

        Chicken chicken2 = new Chicken();
        chicken2.sauce = "간장";
        chicken2.drink = "사이다";

        Chicken.size = 8;

        System.out.println("주문하신 치킨의 소스는 " + chicken.sauce + "이고, 음료수는 " + chicken.drink + "입니다");
        System.out.println("두 번째 주문하신 치킨의 소스는 " + chicken2.sauce + "이고, 음료수는 " + chicken2.drink + "입니다");
        System.out.println("전체적인 물가상승으로 기존 10호닭에서 " + Chicken.size + "호로 변경되었습니다.");
    }
}
class Chicken{
    static int size = 10;
    String sauce;
    String drink;
}
