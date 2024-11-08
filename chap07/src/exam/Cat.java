package exam;

public class Cat extends Animal {
    static double normalJumpHeight = 1;
    double jumpHeight;

    public Cat(double jumpHeight) { // 생성자
        this.jumpHeight = jumpHeight;
    }

    public boolean IsHealthy() {
        if(jumpHeight > normalJumpHeight)
            return true;
        else
            return false;
        // Animal에서 선언된 엉터리 함수를 extends 상속을 취하면서 위와 같이 구동되는 함수로 바뀐다. 오버라이딩
    }
}
