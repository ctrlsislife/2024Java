package sector04_Method;

public class Method_03_Car {

    // 필드
    int gas;

    // 생성자

    // 메소드
    void setGas(int gas) { // 리턴값이 없는 메소드 , 매개값을 받아 gas 필드값 변경
        this.gas = gas;
    }

    boolean isLeftGas(){ // 리턴갑이 불인 메소드로 gas 필드값이 0이면 거짓, 0 이 아니면 참을 반환
        if(gas == 0) {
            System.out.println("No gas");
            return false;
        }
        System.out.println("left gas");
        return true;
    }




    void run() { // 리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드 강제 종료
        while(true) {
            if(gas > 0) {
                System.out.println("주행가능상태입니다.(주행가능거리:" + gas + ")");
                gas -=1;
            } else {
                System.out.println("주행불가 시동이 꺼집니다.(주행가능거리:" + gas + ")");
                return; // 메소드 종료
            }
        }
    }
}
