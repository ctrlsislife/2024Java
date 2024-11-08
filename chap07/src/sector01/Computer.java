package sector01;

public class Computer extends Calculator {
    @Override // areaCircle 메소드가 정확히 재정의된 것인지 컴파일러가 확인하도록 정의함
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
