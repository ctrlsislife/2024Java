package sector01.dahyeongseong;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child; // 자동 타입 변환
        parent.method1();
        parent.method2();  // 재정의된 메소드 호출 가능
        // parent.method3(); // 호출 불가능
    }
}
