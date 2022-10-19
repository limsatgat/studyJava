class Car {
    // this() this.
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }

    Car(String color){
        this(color, "auto", 4);
    }

    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
public class Ex06_This {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println("c1의 색깔은 = " +c1.color + ", 기어는 + " + c1.gearType + ", 문짝의 개수는 + " + c1.door);
        System.out.println("c2의 색깔은 = " +c2.color + ", 기어는 + " + c2.gearType + ", 문짝의 개수는 + " + c2.door);
    }
}