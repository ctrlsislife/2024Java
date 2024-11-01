package sector01;

public class Inheritance_02_LowerClass extends Inheritance_01_HigherClass {


    // dmb전화기를 표현하는 클래스

    // 필드
    static int channel;


    // 생성자
    Inheritance_02_LowerClass(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    // 메소드
    static void turnOndmb() {
        System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
    }
    static void changeChannelDmb(int channel) {
        System.out.println("채널 " + channel + "번으로 변경");
    }
    static void turnOffadmb() {
        System.out.println("DMB 수신을 중단");
    }
}
