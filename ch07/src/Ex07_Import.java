//import java.util.Scanner;

public class Ex07_Import {

    public static void main(String[] args) {
        java.util.Scanner notImport = new java.util.Scanner(System.in);
//        Scanner notImport = new Scanner(System.in);
        System.out.print("출력할 값을 입력하세요. : ");

        int inputValue = notImport.nextInt();

        System.out.println("발표자가 입력한 값은 : " + inputValue);
    }
}
