public class Ex03_String {
    public static void main(String[] args) {
        String a = "a";
        System.out.println(a);
        System.out.println("기존 a의 해쉬코드 : " + a.hashCode());
        String b = "b";
        System.out.println(b);
        System.out.println("기존 b의 해시코드 : " + b.hashCode());
        a = a + b;
        System.out.println(a);
        System.out.println("변경된 a의 해시코드 : " + a.hashCode());
    }
}
