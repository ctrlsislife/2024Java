package sector04_Method;

public class Method_02_CalculatorMain {
    public static void main(String[] args) {
        Method_01_Calculator myCalc = new Method_01_Calculator();
                myCalc.powerOn();  // 계산기를 켜는 동작

                int result1 = myCalc.plus(5, 6); // 나누기 연산 수행 >> 결과값 존재
                System.out.println("result1 = " + result1);

                byte x = 10;
                byte y = 4;
                double result2 = myCalc.divide(x, y);
                System.out.println("result2 = " + result2);

                myCalc.powerOff();
    }
}
