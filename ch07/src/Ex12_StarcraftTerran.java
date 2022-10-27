// 지상
interface GroundUnit {
    int x = 0, y = 0;
    void move();

//    default void select(){
//        System.out.println("선택되었습니다.");
//    }
}

// 지상, 인간형
class Marine implements GroundUnit {
    int x = 100, y = 200;
    @Override
    public void move(){
        System.out.println("go go go");
    }
    void stimPack(){}
}

// 지상, 기계형
class Tank implements GroundUnit, SCV {
    int x = 100, y = 200;
    @Override
    public void move() {
        System.out.println("drrk drrk");
    }
    void siegeMode(){}
    public void repair(){}
}

// 공중
interface AirUnit {
    int x = 0, y = 0;
    void flight();
//    default void select(){
//        System.out.println("선택되었습니다.");
//    }
}

// 공중, 기계형
class Battlecruiser implements AirUnit, SCV{
    int x = 100, y = 200;
    public void flight(){
        System.out.println("Set a course");
    }
    void yamato(){};
    public void repair(){}
}

// 수리, 기계형 한정
interface SCV {
    void repair();
}

// 본진
public class Ex12_StarcraftTerran {
    public static void main(String[] args) {
        Battlecruiser b = new Battlecruiser();
//        b.select();
        b.flight();
    }
}
