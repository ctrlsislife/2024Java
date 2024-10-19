package sector04_Method;

public class Method_10_CalculatorMain {
    public static void main(String[] args) {
        Method_09_Calculator myCalc =  new Method_09_Calculator();

        // 정사각형의 넓이 구하기
        double result1 = myCalc.areaRectangle(10);

        // 직사각형의 넓이 구하기
        double result2 = myCalc.areaRectangle(10,20);


        System.out.println("정사각형 넓이:" + result1);
        System.out.println("직사각형 넓이:" + result2 );
    }
}
