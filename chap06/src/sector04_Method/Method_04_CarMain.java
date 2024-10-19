package sector04_Method;

public class Method_04_CarMain {
    public static void main(String[] args) {
        Method_03_Car myCar = new Method_03_Car();

        myCar.setGas(10); //Car의 setGas() 메소드 호출

        boolean gasState = myCar.isLeftGas();  // car의 isLeftGas() 메소드 호출
                if(gasState) {
                    System.out.println("주행시작");
                    myCar.run(); // Car의 run() 메소드 호출
                }


        if(myCar.isLeftGas()) { // Car의 isLeftGas() 메소드 호출
            System.out.println("연료를 보충할 필요가 없습니다.");
        } else {
            System.out.println("견인차를 불러 연료를 보충하십시오.");
        }
    }
}
