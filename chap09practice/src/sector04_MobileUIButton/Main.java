package sector04_MobileUIButton;


// 프로그램 실행을 위한 Main 클래스 정의
public class Main {
    public static void main(String[] args) {
        Window w = new Window(); // Window 객체 생성

        // Window 클래스 내부에서 정의된 버튼1과 버튼2를 클릭
        w.button1.touch(); // 버튼1의 클릭 이벤트 실행
        w.button2.touch(); // 버튼2의 클릭 이벤트 실행
    }
}


