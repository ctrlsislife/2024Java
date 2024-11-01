package sector06_AccessAvailable;

public class AccessAvailable_02_B {
    public AccessAvailable_02_B() {
        AccessAvailable_01_A a = new AccessAvailable_01_A();
        a.field1 = 1;
        a.field2 = 1;
        // a.field3 = 1; private 필드 접근 불가

        a.method1();
        a.method2();
        // a.method3(); private 메소드 접근 불가
    }
}
