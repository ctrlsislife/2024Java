package sector01NestedClassInterface;

public class Main {
        public static void main(String[] args) {
            A a = new A();

            // 인스턴스 멤버 클래스 객체 생성
            A.B b = a.new B();
            b.field1 = 3; // B 클래스의 인스턴스 필드 값을 설정
            b.method1();  // B 클래스의 메서드 호출

            // 정적 멤버 클래스 객체 생성
            A.C c = new A.C();
            c.field1 = 3; // C 클래스의 인스턴스 필드 값을 설정
            c.method1();  // C 클래스의 메서드 호출
            A.C.field2 = 3; // C 클래스의 정적 필드 값을 설정
            A.C.method2();  // C 클래스의 정적 메서드 호출

            // 로컬 클래스 객체 생성을 위한 메서드 호출
            a.method();
        }
    }


