package sector06_AccessAvailable;

public class AccessAvailable_01_A {
    // field
    public int field1; //public
    int field2; // default
    private int field3; // private

    // 생성자
    public AccessAvailable_01_A() {
        field1 = 1;
        field2 = 2;
        field3 = 3;

        method1();
        method2();
        method3();
        // 클래스 내부에선 접근 제한자의 영향을 받지 않는 모습
    }

    // 메소드
     public void method1() {} // public 접근제한
    void method2() {} // default 접근 제한
    private void method3() {} // private  접근 제한
}
// 접근 제한과는 상관 없이 필드와 메소드 모두 사용 가능