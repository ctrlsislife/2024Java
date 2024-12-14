package sector02_threadManipulate;

    import java.awt.Toolkit;

    public class Sleep{
        public static void main(String[] args) {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for(int i=0; i<10; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(3000);  // 3초간 메인 스레드를 얼림
                } catch(InterruptedException e) {
                }
            } // 3초 주기로 10번의 비프음 발생됨
        }
    }

}
