package sector04_Method;
// 클래스 외부에서 메소드 호출
public class Method_07_Car {
    // 필드
    int speed;

    // 생성자

    // 메소드
    int getSpeed() {
        return speed;
    }

    void keyTurnOn() {
        System.out.println("Engine Start");
    }

    void run() {
        for(int i =10; i<=50; i+=10) {
            speed = i;
            System.out.println("주행중인 상태(시속:"+speed+"km/h)");
        }
    }
}
