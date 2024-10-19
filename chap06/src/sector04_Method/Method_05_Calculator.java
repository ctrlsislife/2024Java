package sector04_Method;
// 클래스 내부 메소드 호출
public class Method_05_Calculator {
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }


    double avg(int x, int y) {
        double sum = plus(x, y); // 4라인의 sum 호출
        double result = sum / 2;
        return result;
    }


    void execute() {
        double result = avg(7,10); // 10라인의 avg 호출
        println("실행결과: " + result); // 22라인의 println 호출
    }

    void println(String message) {
        System.out.println(message);
    }
}
