package sector06_AccessAvailable;

public class AccessAvailable_04_GetterSetter02 {
    public static void main(String[] args) {
        AccessAvailable_03_GetterSetter myCar = new AccessAvailable_03_GetterSetter();

        // 비정상적인 속도 변경값
        myCar.setSpeed(-50);

        System.out.println("현재 속도: " + myCar.getSpeed());


        // 올바른 속도 변경
        myCar.setSpeed(50);


        // 정지
        if(!myCar.isStop()) {
            myCar.setStop(true);
        }

        System.out.println("현재 속도: " + myCar.getSpeed());
    }
}
