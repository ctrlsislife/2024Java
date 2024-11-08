package sector01.AbstractMethod;
// 추상 메소드 재정의
public class Snake extends Animal {
    public Snake() {
        this.species = "파충류";
    }

    @Override
    public void sound() {
        System.out.println("쉬익");
    }
}
