package sector01.AbstractMethod;
// 추상 메소드 재정의

public class Dog extends Animal {
    public Dog() {
        this.species = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
