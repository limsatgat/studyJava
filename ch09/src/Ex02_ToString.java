class Example {

    private String name;
    private String gender;

    public Example(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

//    @Override
//    public String toString() {
//        return "내 이름은 " + name + "이고, 성별은" + gender + "입니다.";
//    }
}

public class Ex02_ToString {

    public static void main(String[] args) {
        Example introduceMySelf = new Example("임수헌", " 남성");

        System.out.println(introduceMySelf);
        // 제 이름은 임수헌이고, 성별은 남성입니다.
    }
}