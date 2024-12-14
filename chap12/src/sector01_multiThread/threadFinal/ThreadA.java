package sector01_multiThread.threadFinal;

public class ThreadA extends Thread {
    public ThreadA() {
        setName("ThreadA"); // thread 의 이름 설정
    }

    public void run() {
        for(int i=0; i<2; i++) { // 스레드 실행 내용
            System.out.println(getName() + "가 출력한 내용");
        }
    }
}

