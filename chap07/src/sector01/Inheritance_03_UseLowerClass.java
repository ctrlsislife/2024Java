package sector01;

import static sector01.Inheritance_02_LowerClass.*;

public class Inheritance_03_UseLowerClass {
    public static void main(String[] args) {

        // DMB 휴대폰 객체 생성
        Inheritance_02_LowerClass dmbCellPhone = new Inheritance_02_LowerClass("갤럭시","검정",10);


        // 상위 클래스로부터 상속받은 필드
        System.out.println("모델: " + dmbCellPhone.model);
        System.out.println("색상: " + dmbCellPhone.color);

        // 하위 클래스의 필드
        System.out.println("채널: " + dmbCellPhone.channel);

        // 상위 클래스로부터 상속받은 메소드 호출
        Inheritance_02_LowerClass.powerOn();
        Inheritance_02_LowerClass.bell();
        Inheritance_02_LowerClass.sendVoice("여보세요.");
        Inheritance_02_LowerClass.recieveVoice("안녕하세요 저는 _입니다.");
        Inheritance_02_LowerClass.sendVoice("반갑습니다.");
        Inheritance_02_LowerClass.hangUp();

        // 하위 클래스의 메소드 호출
        Inheritance_02_LowerClass.turnOndmb();
        Inheritance_02_LowerClass.changeChannelDmb(12);
        Inheritance_02_LowerClass.turnOffadmb();

    }
}
