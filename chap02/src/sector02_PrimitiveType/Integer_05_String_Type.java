package sector02_PrimitiveType;

public class Integer_05_String_Type {
    public static void main(String[] args) {

        String name = "홍길동";
        String job = "프로그래머";
        // 1. 작은 따옴표(')로 감싼 문자는 char 타입 변수에 저장되어 유니코드로 변환되어 저장되지만
        // 2. 큰따옴표(")로 감싼 문자는 유니코드로 변환되지 않는다.
        // 3. 자바에서 큰따옴표로 감싼 문자들을 문자열이라고 부르며
        // 4. 작은따옴표와 큰따옴표는 컴파일러가 문자 리터럴과 문자열 리터럴을 구별하는 기호로 사용된다
        // 5. 따라서 문자열을 변수에 저장하고 싶다면 위와 같이 String 타입을 사용해야 한다.

        System.out.println(name);
        System.out.println(job);
    }
}
