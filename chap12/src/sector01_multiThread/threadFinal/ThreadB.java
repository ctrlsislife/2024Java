package sector01_multiThread.threadFinal;

public class ThreadB extends Thread {
    public void run() {
        for(int i=0; i<2; i++) { // threadB의 실행내용
            System.out.println(getName() + "가 출력한 내용");
        }
    }
}

