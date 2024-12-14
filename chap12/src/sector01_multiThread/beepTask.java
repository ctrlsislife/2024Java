package sector01_multiThread;


import java.awt.Toolkit;
// 비프음을 발생시키면서 동시에 출력을 하려면 두 작업 중 하나를 서브 스레드에서 실행해야함

class BeepTask implements Runnable {
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();  // 스레드 작업
        for(int i=0; i<5; i++) {
            toolkit.beep();
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}

