public class Ex04_ExceptionReThrowing {
    public static void main(String[] args) {
        try {
            Pay();
        } catch (Exception e) {
            System.out.println("2차 " + e.getMessage() + "가 완료되었습니다.");
        }
    }

    static void Pay() throws Exception{
        try {
            throw new Exception("더치페이");
        } catch (Exception e){
            System.out.println("1차 " + e.getMessage() + "가 완료되었습니다.");
            throw e;
        }
    }

    // 반대로
}
