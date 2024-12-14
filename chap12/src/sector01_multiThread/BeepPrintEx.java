package sector01_multiThread;

import java.awt.*;

public class BeepPrintEx {


    public class BeepPrintExample1 {
        public static void main(String[] args) {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for(int i=0; i<5; i++) {
                toolkit.beep(); // 비프음 발생
                try { Thread.sleep(500); } catch(Exception e) {} // 500 -> 0.5초간 정지
            }

            for(int i=0; i<5; i++) {
                System.out.println("띵");
                try { Thread.sleep(500); } catch(Exception e) {}// 500 -> 0.5초간 정지
            }
        }
    }

}
