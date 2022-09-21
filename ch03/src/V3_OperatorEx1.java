public class V3_OperatorEx1 {

    // 증감 연산자의 전위형, 후위형 비교
    public static void main(String[] args) {
        int i = 5;
        i++;
        System.out.println("(전위형)i++ = " + i);

        i = 5;
        ++i;
        System.out.println("(후위형)++i = " + i);
    }
}
