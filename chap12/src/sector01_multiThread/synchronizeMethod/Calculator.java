package sector01_multiThread.synchronizeMethod;
// 공유 객체
    public class Calculator {
        private int memory;

        public int getMemory() {
            return memory;
        }



        // void 전에 synchronized 붙이면 동기화되어 점유중일때는 서로 사용하지 못함 
        public void setMemory(int memory) { // 계산기 메모리에 값을 저장하는 메소드
            this.memory = memory; // 매개값을 메모리 필드에 저장
            try { // 스레드를 2초간 정지시키는 기능
                Thread.sleep(2000);
            } catch(InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
        }
    }
