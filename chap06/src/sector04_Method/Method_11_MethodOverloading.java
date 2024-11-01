package sector04_Method;

public class Method_11_MethodOverloading {
    // 메소드 오버로딩은 코드를 더 깔끔하고 읽기 쉽게 만듦
// 예를 들어 여러 기능을 가진 calculator를
// calculator1 , calculator2, calculator3 이런식으로
// 구현하면 코드도 복잡해지고 오류가 발생하기 쉽다


    // 정사각형 넓이 구하기
    double areaRectangle(double width) {
        return width * width;
    }

    // 직사각형의 넓이 구하기
    double areaRectangle(double width, double height) {
        return width * height;
    }
}
