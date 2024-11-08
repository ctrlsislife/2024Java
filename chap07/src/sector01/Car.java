package sector01;

public class Car {
    // Method 선언시 final 키워드 붙이면 최종적인 메소드가 되어 재정의할 수 없다.
    // 부모 클래스를 상속해서 자식 클래스를 선언할 때 부모 클래스에 선언된 파이널 메소드는 자식 클래스에서 사용할 수 없다


    // 필드
    public int speed;

    // 메소드
    public void speedUp() { speed += 1; }

    // final 메소드
    public final void stop(){
        System.out.println("차가 정지");
        speed = 0;
        // Car클래스의 stop 메소드를 final로 선언하여 car를 상속한 다른 클래스에선 stop메소드를 사용하지 못함
    }
}
