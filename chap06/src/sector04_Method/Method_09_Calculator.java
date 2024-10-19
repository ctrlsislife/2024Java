package sector04_Method;

public class Method_09_Calculator {

    //메소드 오버로딩

    // 정사각형의 넓이
    double areaRectangle(double width) {
        return width * width;
    }

    // 직사각형의 넓이
    double areaRectangle(double width, double height) {
        return width * height;
    }
}
