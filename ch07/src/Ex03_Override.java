// 오버라이딩과 오버로딩
class Chicken {
    String seasoned;
    String fried;

    String getMenu() {
        return "메뉴는" + seasoned + "과, " + fried + "가 있습니다.";
    }
}

class OverrideChic extends Chicken {
    String half;

    String getMenu() {   // 부모의 getMenu()를 오버라이딩
        return "메뉴는 " + seasoned + "과 " + fried + ", 그리고 " + half + "이 있습니다.";
    }

    String getMenu(String close) {
        return close + ".";
    }
}

public class Ex03_Override {
    public static void main(String[] args) {
        OverrideChic chic = new OverrideChic();
        chic.seasoned = "양념";
        chic.fried = "후라이드";
        chic.half = "반반";

        System.out.println(chic.getMenu());
        System.out.println(chic.getMenu("마감입니다"));

    }
}

/* 오버라이딩 : 상속받은 메서드의 내용을 변경하는 것 */
/* 오버로딩 : 기존에 없는 새로운 매서드를 정의하는 것 */