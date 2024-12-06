package sector02_exceptionPrevent;

public class ex01_UseTryCatch {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("String2"); // try 블록에는 예외 발생 가능 코드 위치
        } catch(ClassNotFoundException e) { // try 코드가 예외 없이 정상 실행되면 잡지 않고 finally 실행
            System.out.println("클래스가 존재하지 않습니다.");
        }                                       // try 에서 예외 발생시 catch에 의해 잡힘
    }
}

