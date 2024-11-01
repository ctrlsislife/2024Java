package sector01;

import java.sql.SQLOutput;

public class Inheritance_01_HigherClass {

    // 하위 클래스가 선언시 어떤 상위 클래스를 상속받을 것인지 결정하고 선택된 상위클래스는
    // class 하위클래스 extends 부모클래스 {

    // } 와 같이 기술한다.

    // 전화기를 표현하는 클래스
    // 필드 생성
    String model;
    String color;

    // 생성자

    // 메소드
    static void powerOn() {
        System.out.println("전원을 켭니다.");}

    static void powerOff() {
        System.out.println("전월을 끕니다.");}

    static void bell() {
        System.out.println("벨이 울립니다.");}

    static void sendVoice(String message) {
        System.out.println("자기: " + message); }

    static void recieveVoice(String message) {
        System.out.println("상대방: " + message);}

    static void hangUp() {
        System.out.println("전화를 끊습니다."); }
    }
