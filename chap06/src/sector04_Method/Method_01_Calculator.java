package sector04_Method;

public class Method_01_Calculator {

// 메소드 선언

    void powerOn() { // 결과값이 없는 메소드
        System.out.println("전원을 켭니다.");
    }

    int plus(int x, int y) {// 결과값이 있는 메소드 {
        int result = x + y;
        return result;
    }


    double divide(int x, int y) {
        double result = (double)x / (double)y;
        return result;
    }

    void powerOff() {
        System.out.println("전원을 끕니다");
    }


}
