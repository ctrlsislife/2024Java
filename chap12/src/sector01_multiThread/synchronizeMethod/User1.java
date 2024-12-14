package sector01_multiThread.synchronizeMethod;

public class User1 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User1"); // 스레드 이름 정의
        this.calculator = calculator; // 공유객체인 calcuator를 필드에 저장
    }

    public void run() {
        calculator.setMemory(100);
    } // 공유 객체 calculator의 메모리에 100저장
}

