package sector02_threadManipulate;

public class Interrupt {
    public static void main(String[] args)  {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        thread.interrupt(); // 스레드 종료를 위해 인터럽트예외를 발생시킴
    }
}


