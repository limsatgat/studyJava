//// 상속
//class Tv {
//    int channel;
//
//    void channelUp() {
//        ++channel;
//    }
//}
//
//class SmartTv extends Tv {
//    boolean caption;
//
//    void displayCaption(String text) {
//        if (caption) {
//            System.out.println(text);
//        }
//    }
//}
//
//public class Ex01_Tv {
//    public static void main(String[] args) {
//        SmartTv ctv = new SmartTv();    // smartTv 객체 생성
//        ctv.channel = 10;   // 조상으로부터 상속받은 멤버
//        ctv.channelUp();
//        System.out.println(ctv.channel);
//        ctv.displayCaption("한글자막입니다.");
//        ctv.caption = true;     // 자막 켜기
//        ctv.displayCaption("한글자막입니다.");
//    }
//}
//
///*
//Tv가 부모클래스, SmartTv가 자식클래스
//현재 부모의 클래스의 멤버는 2개(채널, 채널업), 자식 클래스의 멤버도 2개이지만 상속받아 총4개
//자식클래스에서 부모클래스를 extends를 이용하여 상속받고
//메인메소드에서 자식클래스를 생성하면 부모클래스의 멤버와 자식클래스의 멤버가 합쳐진 하나의 인스턴스가 생성된다.
//*/
