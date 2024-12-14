package sector01_multiThread.synchronizeMethod;

public class User2 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User2"); // 스레드 이름 저장
        this.calculator = calculator; // 공유객체인 calculator를 필드 저장
    }

    public void run() {
        calculator.setMemory(50);
    } // 공유객체에 50저장
}
