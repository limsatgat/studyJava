    // 메서드의 호출
public class Ex04_CallMethod {

    public static void main(String[] args) {
        MethodCall mc = new MethodCall();
        long result = mc.add(5L, 3L);

        System.out.println("add(5L, 3l) = " + result);
    }
}
class MethodCall {
    long add(long a, long b){
        return a + b;
    }
}
