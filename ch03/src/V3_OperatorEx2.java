public class V3_OperatorEx2 {

    // 증감 연산자의 전위형, 후위형 비교(2)
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++;
        System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);

        i = 5;
        j = 0;

        j = ++i;
        System.out.println("j = ++i; 실행 후, i = "+ i + ", j = " + j);
    }
}
