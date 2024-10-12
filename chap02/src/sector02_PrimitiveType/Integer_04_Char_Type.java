package sector02_PrimitiveType;

public class Integer_04_Char_Type {
    public static void main(String[] args) {

        char c1 = 'A'; // 문자를 직접 저장
        char c2 = 65;  // 문자를 십진수로 저장
        char c3 = '\u0041';  // 문자를 16진수로 저장
        // --- char type 'A' 문자 저장 방식 ---

        char c4 = '가';  // 문자를 직접 저장
        char c5 = 44032; // 문자를 10진수로 저장
        char c6 = '\uac00';  // 문자를 16진수로 저장
        // --- char type '가' 문자 저장 방식 ---

        // 1. 하나의 문자를 작은따옴표로 감싼 문자 리터럴 ('문') 은 유니코드로 변환되어 저장된다
        // 2. 자바는 이러한 유니코드를 저장할 수 있도록 2byte 크기인 char 타입을 제공한다
        // 3. 유니코드가 정수이므로 char 타입도 정수 타입에 속한다
        // 4. 그래서 char 변수에 작은따옴표로 감싼 문자 뿐 아니라 10진수 , 16 진수 형태로 유니코드를 저장할 수 있다.
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
    }
}
