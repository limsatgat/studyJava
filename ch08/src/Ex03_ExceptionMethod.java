public class Ex03_ExceptionMethod {
    public static void main(String[] args) {

        //PassMethod
        MethodBall();
        System.out.println("저는 라쿤입니다");
    }

    static void MethodBall(){
        try {
            throw new Exception("폭탄");
        } catch (Exception e){
            System.out.println(e.getMessage() + "은 너굴맨이 처리했으니 안심하라구");
            e.printStackTrace();
        }
    }

    // 반대로
}
