package sector02_exceptionPrevent;

public class ex04_Throws {
    public static void main(String[] args) {
        try {
            findClass();
        } catch(ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }
}

// throws는 메소드 선언부 끝에 작성되어 메소드의 예외를 호츨한 곳으로 던짐
// throws 뒤에는 떠넘길 예외 클래스들을 쉼표로 구분해 나열
