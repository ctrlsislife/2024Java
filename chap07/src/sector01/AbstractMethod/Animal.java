package sector01.AbstractMethod;

public abstract class Animal { // 추상 클래스
    public String species;

    public void breathe() {
        System.out.println("숨을 쉬는중");
    }

    public abstract void sound(); // 추상 메소드
}
