package sector04_Method;

public class Method_12_MethodOverloading2 {
    public static void main(String[] args) {
        Method_11_MethodOverloading myCalcunit = new Method_11_MethodOverloading();

        // 정사각형의 넓이 결과
        double result1 = myCalcunit.areaRectangle(10);

        // 직사각형의 넓이 결과
        double result2 = myCalcunit.areaRectangle(10,20);

        // 출력
        System.out.println("정사각형 넓이=" + result1);
        System.out.println("직사각형 넓이=" + result2);

    }
}
